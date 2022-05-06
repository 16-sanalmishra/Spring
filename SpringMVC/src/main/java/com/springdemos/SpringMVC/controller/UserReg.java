package com.springdemos.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springdemos.SpringMVC.dto.User;

@Controller
public class UserReg {
	@RequestMapping("/userfirst")
	public ModelAndView first() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userreg");
		return mv;
		
	}
	@RequestMapping(value = "registeruser", method = RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		mv.setViewName("userregresult");
		return mv;
	}
	

//	@RequestMapping("/register")
//	public String showRegistrationPage() {
//		return "userreg";
//	}
//	
//	@RequestMapping(value="registeruser", method=RequestMethod.POST)
//	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
//		System.out.println("Received object from UI: " + user);
//		model.addAttribute("user", user);
//		return "userregresult";
//	}
}
