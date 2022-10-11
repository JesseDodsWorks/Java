package com.dojoninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojoninja.models.Dojo;
import com.dojoninja.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	DojoRepository dojoRepository;
	
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	public Dojo createDojo(Dojo item) {
		return dojoRepository.save(item);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
	
	public Dojo updateDojo(Dojo item) {
		return dojoRepository.save(item);
	}
	
	public void deleteDojo(Long id) {	
		dojoRepository.deleteById(id);
	}
		
}

