package com.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/")
    // 3. Method that maps to the request route above
	public String name(@RequestParam(value="f", required=false) String searchFirst, @RequestParam(value="l", required=false) String searchLast) {
		if(searchFirst == null) {
			searchFirst = "Human";
		}
		if(searchLast == null) {
			searchLast = "";
		}
        return "Hello " + searchFirst + " " + searchLast;
    }
}
