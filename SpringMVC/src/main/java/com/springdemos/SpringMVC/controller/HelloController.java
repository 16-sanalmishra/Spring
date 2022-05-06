package com.springdemos.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 233);
		mv.addObject("Name", "Sanal");
		mv.addObject("salary", 2331);
		mv.setViewName("hello");
		return mv;
	}
}
