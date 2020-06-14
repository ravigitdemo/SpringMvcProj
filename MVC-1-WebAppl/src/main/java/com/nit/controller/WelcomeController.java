package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcomePage")
	public ModelAndView displayWelcomePage() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome Ravi in MVC Web Appl");
		mav.setViewName("welcome");
		return mav;
	}

}
