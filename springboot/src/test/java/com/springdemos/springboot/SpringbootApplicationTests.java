package com.springdemos.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springdemos.springboot.service.SampleService;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;
	@Test
	void save() {
		SampleService sampleService = context.getBean(SampleService.class);
		sampleService.save();
	}

}
