package com.stl.ManagerCheck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stl.ManagerCheck.model.ManagerCheckEmployeemodel;
import com.stl.ManagerCheck.repository.ManagerCheckRepo;

@Service
public class ManagerCheckServiceImpl implements ManagerCheckService{
	
	@Autowired
	ManagerCheckRepo repo;

	@Override
	public List<String> getAssginEmployees(String manageremail) {
		return repo.getAssginEmployees(manageremail);
	}
	
	

}
