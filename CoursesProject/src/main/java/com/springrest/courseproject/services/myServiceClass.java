package com.springrest.courseproject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.courseproject.Entities.*;
@Service
public class myServiceClass {

List<myEntities> list;
	
	public myServiceClass() {
		list = new ArrayList<>();
		list.add(new myEntities(1,"Java","Java Course for Beginners"));
		list.add(new myEntities(2,"Python","Python Course for Beginners"));
	}
	
	
	public List<myEntities> getCourses(){
		return list;
	}
}
