package com.dvp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DvpController {

	@RequestMapping("/daikichi/travel/{place}")
    public String location(@PathVariable("place") String place) {
    	return "Congratulations! You will soon travel to " + place;
    }
	
	@RequestMapping("/daikichi/lotto/{number}")
    public String lotto(@PathVariable("number") Integer number) {
		
    	if(number %2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers";
    	}
    	else if(number %2 == 1) {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    	else {
    		return "place a number at the end. No characters.";
    	}
    }
	
}