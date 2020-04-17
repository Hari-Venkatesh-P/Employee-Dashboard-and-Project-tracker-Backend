package com.hari.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hari.model.ApiResponse;
import com.hari.model.Employee;
import com.hari.service.EmployeeService;





@CrossOrigin
@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired EmployeeService employeeService;
	
	@RequestMapping(path="/addemployee" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse addEmployee(@RequestBody Employee emp)
	{
		return employeeService.addEmployee(emp);
		
	}
	
	@RequestMapping(path="/getmaxemployeeid" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse getMaxEmployeeId()
	{
		return employeeService.getMaxEmployeeId();
		
	}
	
	@RequestMapping(path="/getallemployees" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	
	@RequestMapping(path="/searchemployee/{id}" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Employee> searchEmployee(@PathVariable("id") String id)
	{
		return employeeService.searchEmployee(id);
	}
	
	@RequestMapping(path="/deleteemployee/{id}", method = RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse deleteEmployee(@PathVariable("id") String id)
	{
		return employeeService.deleteEmployee(id);
		
	}
	
	
	
	
}