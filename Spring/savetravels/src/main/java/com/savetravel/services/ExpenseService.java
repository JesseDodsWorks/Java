package com.savetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savetravel.models.Expense;
import com.savetravel.repositories.ExpenseRepository;

@Service
public class ExpenseService {
		
	@Autowired 
	ExpenseRepository expenseRepository;
	
	
	
	//	GETTING ALL
	public List<Expense> allExpenses() {
	    return expenseRepository.findAll();
	}
	//	CREATING
	public Expense createExpense(Expense item) {
		return expenseRepository.save(item);
	}
	//	GETTING ONE
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	//	UPDATE ONE
	public Expense updateExpense(Expense item) {
		return expenseRepository.save(item);
	}
	//	DELETE ONE
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
	

// END
}
