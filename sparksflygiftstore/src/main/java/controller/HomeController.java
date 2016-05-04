package controller;
import org.springframework.stereotype.Controller;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.*;
 
@Controller
public class HomeController {
	
	 
	@RequestMapping("/")
	public String showMessage() {
			return "index";
	}
	 
		@RequestMapping("/nextpage")
		public String showNextMessage() {
				return "nextpage";
		}
		
		@RequestMapping("/LandingPage")
		public String showLandingPageMessage() {
				return "LandingPage";
		}
}
