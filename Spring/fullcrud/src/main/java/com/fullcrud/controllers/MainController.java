package com.fullcrud.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fullcrud.models.HomeModel;
import com.fullcrud.services.MainService;

@Controller
public class MainController {

	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	public String root() {
	    return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(Model model, @ModelAttribute("expense") HomeModel expense) {
		model.addAttribute("expenses", mainService.allExpenses()); 
		
        return "index.jsp";
    }
	
//	ADDING NEW EXPENSE FROM HOME PAGE (index.jsp)
	@PostMapping("/expense/new")
	public String create(
			Model model, 
			@Valid @ModelAttribute("expense") HomeModel expense, 
			BindingResult result
			) {

		model.addAttribute("expenses", mainService.allExpenses()); 
		
		if(result.hasErrors()) {
			System.out.println("hasErrors");
			return "index.jsp";
		}
		else {
			System.out.println("No Errors");
			mainService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
//	SHOW ONE EXPENSE (show.jsp)
	@GetMapping("/expense/show/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		System.out.println(id);
		HomeModel expense = mainService.findExpense(id);
		
		model.addAttribute("expenses", expense);
		return "show.jsp";
	}
	
//	EDIT ONE EXPENSE (edit.jsp)
	@GetMapping("/expense/edit/{id}")
	public String edit(Model model,	@PathVariable("id") Long id) {
		HomeModel expense = mainService.findExpense(id);
		model.addAttribute("expense", expense);
		return "/edit.jsp";
	}
	@PutMapping("/expense/{id}")
	public String update(@Valid @ModelAttribute("expense") HomeModel expense, BindingResult result) {
		if (result.hasErrors()) {
	        return "/edit.jsp";
	    } else {
	    	mainService.updateExpense(expense);
	    	return "redirect:/expenses";
	    }
	}
	
//	DELETE ONE EXPENSE 
	@DeleteMapping("/expense/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		
		System.out.println("WE MADE IT TO CONTROLLER");
		mainService.deleteExpense(id);
		return "redirect:/expenses";
	}
	
	
	
	
	
//	END
}



















