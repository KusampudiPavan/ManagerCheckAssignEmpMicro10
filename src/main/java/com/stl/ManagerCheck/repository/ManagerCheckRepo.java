package com.stl.ManagerCheck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stl.ManagerCheck.model.ManagerCheckEmployeemodel;


public interface ManagerCheckRepo extends JpaRepository<ManagerCheckEmployeemodel, String> {
	
	
	@Query(value = "SELECT manageremail,employeeid,firstname,email,phonenumber FROM employeemanagementwebapplication.employee where manageremail = ?;", nativeQuery = true)
	List<String> getAssginEmployees(String manageremail);

}
