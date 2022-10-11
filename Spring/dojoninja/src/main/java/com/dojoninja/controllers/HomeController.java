package com.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojoninja.models.Dojo;
import com.dojoninja.models.Ninja;
import com.dojoninja.services.DojoService;
import com.dojoninja.services.NinjaService;

@Controller
public class HomeController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;

	@GetMapping("/")
	public String root() {
	    return "redirect:/dojos/new";
	}
	
// Dojo Paths
	@GetMapping("/dojos/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "addDojo.jsp";
	}
	
	@PostMapping("/dojos/add")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("hasErrors");
			return "addDojo.jsp";
		}
		else {
			System.out.println("No Errors");
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
// Ninja Paths
	@GetMapping("/ninjas/new")
	public String createNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojo", dojoService.allDojos());
		return "addNinja.jsp";
	}
	
	@PostMapping("/ninjas/add")
	public String create(Model model, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("dojo", dojoService.allDojos());
			System.out.println("hasErrors");
			return "addNinja.jsp";
		}
		else {
			System.out.println("No Errors");
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
// Show the Ninjas in each Dojo
	@GetMapping("/dojos/{id}")
	public String showDojo(Model model, @PathVariable("id") Long id ) {
		
		
		Dojo calledDojo = dojoService.findDojo(id);
		model.addAttribute("dojo", calledDojo);
		
		
		return "showDojo.jsp";
	}
	
	
	
	
	
	
	
	
	
}
