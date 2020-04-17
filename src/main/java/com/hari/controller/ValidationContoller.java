package com.hari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hari.model.ApiResponse;
import com.hari.service.ValidationService;




@CrossOrigin
@RequestMapping("/validate")
@RestController
public class ValidationContoller {
	
	@Autowired ValidationService validationService; 
	
	@RequestMapping(path="/tokenvalidation" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse validateToken() {
		return new ApiResponse("200","Token Succesfully Validated","");
	}
	

	@RequestMapping(path="/loginvalidation/{id}/{password}" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse validateLogin(@PathVariable("id") String id,@PathVariable("password") String password) {
		return validationService.validateLogin(id,password);
	}
}