package com.hari.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.model.ApiResponse;
import com.hari.model.Project;
import com.hari.repo.EmployeeRepo;
import com.hari.repo.ProjectRepo;



@Service
public class ProjectService {

	
	@Autowired ProjectRepo projectRepo;
	
	@Autowired EmployeeRepo employeeRepo;

	public ApiResponse addProject(Project project) {
		try {
			if(employeeRepo.existsById(project.getEmployeeId()))
			{
				if(Integer.parseInt(projectRepo.getProjectCount(project.getEmployeeId()))<=2)
				{	
					projectRepo.save(project);
					return new ApiResponse("200","Project Saved successfully");
				}
				else
				{
					return new ApiResponse("201","Cannot assign more than 3 projects ");
				}
			}
			else
			{
				return new ApiResponse("201","Enter a Valid Employee Id");
			}
		}
		catch(Exception e){
			return new ApiResponse("500","Server Error"," "+e);
		}
	}

	public List<Project> searchProjects(String id) {
		return projectRepo.findByEmployeeId(id);
	}

	public ApiResponse deleteProjectById(String id, String eid) {
		try {
			projectRepo.deleteProjectById(id,eid);
			return new ApiResponse("200","Project Deleted Sucessfully");
		}
		catch(Exception e)
		{
			return new ApiResponse("400","Unable to Delete project "+e);
		}
	}
	
	public ApiResponse updateProject(String id, String status, String progress,String eid) {
		try {
			projectRepo.updateProject(id,status,progress,eid);
			return new ApiResponse("200","Project updated Sucessfully");
		}
		catch(Exception e)
		{
			return new ApiResponse("201","Unable to update project "+e);
		}
	}
	
	
	
}
