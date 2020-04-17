package com.hari.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hari.model.Employee;



public interface EmployeeRepo extends JpaRepository<Employee,String>{
		
	@Transactional
    @Modifying
    @Query(value = "delete from employee_details where id = ?1",nativeQuery = true)
	void deleteEmployee(String id);
	
	@Transactional
    @Query(value = "SELECT MAX(SUBSTRING(id, 5, length(id)-4) ) FROM employee_details;",nativeQuery = true)
	String getMaxEmployeeId();

}