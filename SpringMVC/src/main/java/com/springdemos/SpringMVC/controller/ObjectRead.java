package com.springdemos.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemos.SpringMVC.dto.Employee;

@Controller
public class ObjectRead {

	@RequestMapping("/readobject")
	public ModelAndView read() {
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Sanal");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", emp);
		mv.setViewName("empObject");
		return mv;
	}
}