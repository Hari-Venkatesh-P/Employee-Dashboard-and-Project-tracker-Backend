package com.hari.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.model.ApiResponse;
import com.hari.model.Employee;
import com.hari.model.Report;
import com.hari.model.Users;
import com.hari.repo.EmployeeRepo;
import com.hari.repo.ProjectRepo;
import com.hari.repo.ReportRepo;
import com.hari.repo.ValidationRepo;




@Service
public class EmployeeService {

	
	String maxId;
	
	@Autowired EmployeeRepo employeeRepo;
	
	@Autowired ProjectRepo projectRepo;
	
	@Autowired ValidationRepo validationRepo;
	
	
	@Autowired ReportRepo reportRepo;
	
	public ApiResponse addEmployee(Employee employee)
	{
		Users user = new Users(employee.getId(),"password","USERS");
		Report report = new Report(employee.getId()," "," "," ","Trainee");
		if(employeeRepo.existsById(employee.getId()))
		{		
			return new ApiResponse("201","Error in adding the Employee ");
		}
		else
		{
			employeeRepo.save(employee);
			validationRepo.save(user);
			reportRepo.save(report);
			projectRepo.saveFirstProject("1",employee.getId(),"Induction","Kick Started","5");
			return new ApiResponse("200","Employee Saved successfully");
		}
	}
	
	public List<Employee> getAllEmployees() {	
		return  employeeRepo.findAll();
	}
	
	public ApiResponse deleteEmployee(String id) {
		try 
		{
			if(employeeRepo.existsById(id))
			{
				validationRepo.deleteById(id);
				employeeRepo.deleteEmployee(id);
				return new ApiResponse("200","Employee Deleted Successfully"," ");
			}
			else
			{
				return new ApiResponse("201","No Employee exists with id "+id," ");
			}
		}catch(Exception e)
		{
			return new ApiResponse("500","Server Problem"," ");
		}
	}

	public Optional<Employee> searchEmployee(String id) {
		
			return employeeRepo.findById(id);
	}

	public ApiResponse getMaxEmployeeId() {		
		return new ApiResponse("200","Employee Deleted Successfully","EMP-"+String.valueOf(Integer.parseInt(employeeRepo.getMaxEmployeeId())+1));
	}
}
