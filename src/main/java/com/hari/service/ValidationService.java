package com.hari.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.model.ApiResponse;
import com.hari.model.Users;
import com.hari.repo.ValidationRepo;


@Service
public class ValidationService {

	@Autowired ValidationRepo validationRepo;


	
	public ApiResponse validateLogin(String id, String password) {
		if(validationRepo.existsById(id))
		{
			try 
			{
				Users ruser = validationRepo.getUsersById(id);
				if(ruser.getPassword().equalsIgnoreCase(password))
					return new ApiResponse("200","User does Exists",ruser.getRole());
				else
					return new ApiResponse("201","Incorrect Credentials"," ");
			}
			catch(Exception e)
			{
				return new ApiResponse("500","Server Problem  "+e," ");
			}
		}
		else
		{
			return new ApiResponse("201","User does not Exists"," ");
		}
	}
}