package controller;
import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.*;
 
@Controller
public class HomeController {
	
	 
	@RequestMapping("/")
	public String showMessage() {
			return "LandingPage";
	}
	 
		@RequestMapping("/Register")
		public String showNextMessage() {
				return "Register";
		}
		
		@RequestMapping("/LandingPage")
		public String showLandingPageMessage() {
				return "LandingPage";
		}
}
