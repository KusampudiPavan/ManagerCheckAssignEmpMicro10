package com.stl.ManagerCheck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.ManagerCheck.model.ManagerCheckEmployeemodel;
import com.stl.ManagerCheck.service.ManagerCheckService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("ManagerCheck")
public class ManagerCheckController {

	@Autowired
	ManagerCheckService service;
	
	@GetMapping("/get/{manageremail}")
	public List<String> getEmployeeById(@PathVariable("manageremail") String manageremail){
		return service.getAssginEmployees(manageremail);
	}
}
