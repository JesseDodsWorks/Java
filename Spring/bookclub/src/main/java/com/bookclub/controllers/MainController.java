package com.bookclub.controllers;

import javax.servlet.http.HttpSession;
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

import com.bookclub.models.LoginUser;
import com.bookclub.models.Review;
import com.bookclub.models.User;
import com.bookclub.services.ReviewService;
import com.bookclub.services.UserService;

@Controller
public class MainController {
 
 // Add once service is implemented:
	@Autowired
	private UserService userService;
	@Autowired
	private ReviewService reviewService;
	
//	ROOT 
@GetMapping("/")
public String root(HttpSession session) {
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	return "redirect:/homepage";
}
	
	
///////////////////////////////////////////////////////////////////////	log and reg page
//	Defaulting to log and Reg page
 @GetMapping("/login")
 public String index(Model model) {
 
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     return "index.jsp";
 }
 
// If Creating a User
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {
     
     if(result.hasErrors()) {
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     User user = userService.register(newUser, result);
     
     if(result.hasErrors()) {
         model.addAttribute("newLogin", new LoginUser());
         return "index.jsp";
     }
     
     session.setAttribute("userId", user.getId());
     return "redirect:/";
 }
 
// If logging in a User
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
	 User user = userService.login(newLogin, result);
	 
     if(result.hasErrors()) {
         model.addAttribute("newUser", new User());
         return "index.jsp";
     }
 
     session.setAttribute("userId", user.getId());
     
     return "redirect:/";
 }
 
// When logging out
 	@GetMapping("/logout")
	public String logout(HttpSession session) {
	 
		session.setAttribute("userId", null);
	     
	    return "redirect:/login";
	}

 	
///////////////////////////////////////////////////////////////////////	CRUD pages
//	Default to Home Page
@GetMapping("/homepage")
public String index(HttpSession session, Model model) {
	
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	
	model.addAttribute("reviews", reviewService.allReviews());
	
	model.addAttribute("user", userService.findUser((Long)session.getAttribute("userId")));
	return "welcome.jsp";
}
	
// Creating a Review
@GetMapping("/books/new")
public String addReview(HttpSession session, @ModelAttribute("newReview") Review review) {
	
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	else {
		return "addReview.jsp";
	}
}

@PostMapping("/books/create")
public String create(@Valid @ModelAttribute("newReview") Review review, BindingResult result, HttpSession session) {
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	
	if(result.hasErrors()) {
		System.out.println("hasErrors");
		return "addReview.jsp";
	}
	else {
		Long userId = (Long) session.getAttribute("userId");
        User user = userService.findUser(userId);
        
		System.out.println("No Errors");
		review.setUser(user);
		reviewService.createReview(review);
		return "redirect:/homepage";
	}
}
 
//	Show a Review
@GetMapping("/book/{id}")
public String show(HttpSession session, @PathVariable("id") Long id, Model model) {
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	
	
	Review calledReview = reviewService.findReview(id);
	model.addAttribute("user", userService.findUser((Long)session.getAttribute("userId")));
	model.addAttribute("calledReview",calledReview);
	
	return "showReview.jsp";
}

//	Edit a Review
@GetMapping("/edit/review/{id}")
public String edit(HttpSession session, @PathVariable("id") Long id, @ModelAttribute("newReview") Review review, Model model) {
	
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	else {
		
		Review calledReview = reviewService.findReview(id);
		model.addAttribute("newReview", calledReview);
		return "editReview.jsp";
	}
}

@PutMapping("/update/edit/{id}")
public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("newReview") Review review, BindingResult result, HttpSession session, Model model) {
	if(session.getAttribute("userId") == null) {
		return "redirect:/logout";
	}
	
	if(result.hasErrors()) {
		System.out.println("hasErrors");
		return "editReview.jsp";
	}	
	else {
		Long userId = (Long) session.getAttribute("userId");
        User user = userService.findUser(userId);
		
		System.out.println("No Errors");
		review.setUser(user);
		reviewService.updateReview(review);
		return "redirect:/homepage";
	}
}

@DeleteMapping("/delete/{id}")
public String destroy(@PathVariable("id") Long id) {
    reviewService.deleteReview(id);
    return "redirect:/homepage";
}


// END
}

