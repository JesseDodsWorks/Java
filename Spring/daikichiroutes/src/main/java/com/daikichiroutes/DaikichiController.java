package com.daikichiroutes;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 1. Annotation
@RestController
public class DaikichiController {
       
        // 1. Annotation
        @RequestMapping("/daikichi")
        // 3. Method that maps to the request route above
        public String daikichi() { // 3
                return "Welcome!";
        }
        @RequestMapping("/daikichi/today")
        public String today() {
                return "Today you will find luck in all you endeavors";
        }
        @RequestMapping("/daikichi/tomorrow")
        public String tomorrow() {
                return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
        }
}
