package com.dojoninja.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojoninja.models.Ninja;
import com.dojoninja.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	NinjaRepository ninjaRepository;
	
	public List<Ninja> allNinja() {
		return ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja item) {
		return ninjaRepository.save(item);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		else {
			return null;
		}
	}
	
	public Ninja updateDojo(Ninja item) {
		return ninjaRepository.save(item);
	}
	
	public void deleteNinja(Long id) {	
		ninjaRepository.deleteById(id);
	}
		
}
