package com.springdemos.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springdemos.springboot.dao.SampleDAO;

@Component
public class SampleService {

	@Autowired
	SampleDAO sd;
	
	

	public SampleService(SampleDAO sd) {
		System.out.println("Sample Constructor...");
		this.sd = sd;
	}



	public void save() {
		sd.create();
	}
}
