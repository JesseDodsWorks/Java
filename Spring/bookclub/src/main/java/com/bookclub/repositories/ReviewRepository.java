package com.bookclub.repositories;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookclub.models.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

	List<Review> findAll();	
}