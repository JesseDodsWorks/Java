package com.fullcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullcrud.models.HomeModel;
import com.fullcrud.repositories.MainRepository;

@Service
public class MainService {
	@Autowired
	MainRepository mainRepository;
	
	//	GETTING ALL
	public List<HomeModel> allExpenses() {
	    return mainRepository.findAll();
	}
	//	CREATING
	public HomeModel createExpense(HomeModel item) {
		return mainRepository.save(item);
	}
	//	GETTING ONE
	public HomeModel findExpense(Long id) {
		Optional<HomeModel> optionalExpense = mainRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	//	UPDATE ONE
	public HomeModel updateExpense(HomeModel item) {
		return mainRepository.save(item);
	}
	//	DELETE ONE
	public void deleteExpense(Long id) {
		mainRepository.deleteById(id);
	}
	
	
	
	
	
// END
}
