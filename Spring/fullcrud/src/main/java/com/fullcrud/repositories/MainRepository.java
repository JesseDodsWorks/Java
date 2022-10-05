package com.fullcrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fullcrud.models.HomeModel;

@Repository
public interface MainRepository extends CrudRepository<HomeModel, Long> {
	List<HomeModel> findAll();
	
}
