package com.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
public class FruityLoopsControllers {
	
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<FruityItem> fruits = new ArrayList<FruityItem>();
		fruits.add(new FruityItem("Kiwi", 1.5));
		fruits.add(new FruityItem("Mango", 2.0));
		fruits.add(new FruityItem("Goji Berries", 4.0));
		fruits.add(new FruityItem("Guava", .75));
		model.addAttribute("FruityLoopsControllers", fruits);
		
	    return "index.jsp";
	}
}
		

//@RequestMapping("/")
//public String index(Model model) {
//    model.addAttribute("dojoName", "Burbank");
//    return "index.jsp";
//}