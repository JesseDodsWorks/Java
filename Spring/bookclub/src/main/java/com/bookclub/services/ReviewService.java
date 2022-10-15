package com.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bookclub.models.Review;
import com.bookclub.repositories.ReviewRepository;

@Service
public class ReviewService {
	private final ReviewRepository reviewRepository;
	
	 public ReviewService(ReviewRepository reviewRepository) {
	     this.reviewRepository = reviewRepository;
	 }
	 // returns all the books
	 public List<Review> allReviews() {
	     return reviewRepository.findAll();
	 }
	 // creates a book
	 public Review createReview(Review b) {
	     return reviewRepository.save(b);
	 }
	 // retrieves a book
	 public Review findReview(Long id) {
	     Optional<Review> optionalReview = reviewRepository.findById(id);
	     if(optionalReview.isPresent()) {
	         return optionalReview.get();
	     } else {
	         return null;
	     }
	 }
	 
	 public Review updateReview(Review item) {
		 return reviewRepository.save(item);
	 }
	 
	 public void deleteReview(Long id) {
		 reviewRepository.deleteById(id);
	 }
}
