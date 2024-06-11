package com.springrest.courseproject.controller1;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.courseproject.Entities.myEntities;
import com.springrest.courseproject.services.myServiceClass;
@RestController
public class MyController {

	Logger logger = LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/home")
	public String home() {
		logger.info("Home Page Visible");
		return "Home";
		
	}
	@Autowired
	myServiceClass cs;
	
	@GetMapping("/courses")
	public List<myEntities> getCourses(){
		logger.info("Courses Displayed");
		return cs.getCourses();
	}
}
