package com.okform;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OkformController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/omikuji/show")
    public String view() {
    	return "view.jsp";
    }
    
    
    @RequestMapping(value="/formSub", method=RequestMethod.POST)
    public String login(
		HttpSession session, 
        @RequestParam(value="counter") String counter,
        @RequestParam(value="city") String city,
    	@RequestParam(value="person") String person,
    	@RequestParam(value="hobby") String hobby,
    	@RequestParam(value="thing") String thing,
    	@RequestParam(value="message") String message) {
    	
    	String okForm = String.format (
    			"In %s years you will live in %s with your roomate, "
    			+ "%s. The next time you see a %s, you will "
				+ "have good luck. Also %s.",
				counter, city, person, hobby, thing, message);
    					
		session.setAttribute("okForm", okForm);
        // CODE TO PROCESS FORM ie. check email and password
        return "redirect:/omikuji/show";
    }
}


