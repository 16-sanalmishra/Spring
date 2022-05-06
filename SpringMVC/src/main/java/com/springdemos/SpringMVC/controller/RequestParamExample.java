package com.springdemos.SpringMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class RequestParamExample {


	@RequestMapping("/showdata")
	public ModelAndView showdata(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="salary", required=false, defaultValue="0") int salary) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", id);
		mv.addObject("name", name);
		mv.addObject("salary", salary);
		mv.setViewName("hello");
		return mv;
}
}
