package com.savetravel.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.savetravel.models.Expense;
import com.savetravel.services.ExpenseService;


@Controller
public class MainController {
	
	@Autowired
	ExpenseService expenseService;

	
	@GetMapping("/expenses")
    public String index(Model model, @ModelAttribute("expense") Expense expense) {
		model.addAttribute("expenses", expenseService.allExpenses()); 
		
        return "index.jsp";
    }
	
	@PostMapping("/expense/new")
	public String create(
			Model model, 
			@Valid @ModelAttribute("expense") Expense expense, 
			BindingResult result
			) {
		System.out.println(expense.getId());
		System.out.println(expense.getExpense());
		System.out.println(expense.getVendor());
		System.out.println(expense.getAmount());
		model.addAttribute("expenses", expenseService.allExpenses()); 
		
		if(result.hasErrors()) {
			System.out.println("hasErrors");
			return "index.jsp";
		}
		else {
			System.out.println("No Errors");
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	
	
	
	
	
//	END
}
