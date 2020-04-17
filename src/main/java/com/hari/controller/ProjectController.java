package com.hari.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hari.model.ApiResponse;
import com.hari.model.Project;
import com.hari.service.ProjectService;



@CrossOrigin
@RequestMapping("/project")
@RestController
public class ProjectController {

	
	@Autowired ProjectService projectService;
	
	@RequestMapping(path="/getprojectsbyid/{id}" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Project> getProjectsById(@PathVariable("id") String id)
	{
		return projectService.searchProjects(id);
	}
	
	@RequestMapping(path="/addproject" , method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse addEmployee(@RequestBody Project project)
	{
		return projectService.addProject(project);
		
	}
	
	@RequestMapping(path="/updateproject/{id}/{status}/{progress}/{eid}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse updateProject(@PathVariable("id") String id,@PathVariable("status") String status,@PathVariable("progress") String progress,@PathVariable("eid") String eid)
	{

		return projectService.updateProject(id,status,progress,eid);
	}
	
	
	
	@RequestMapping(path="/deleteprojectbyid/{id}/{eid}" , method = RequestMethod.DELETE,  produces=MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse deleteProjectById(@PathVariable("id") String id,@PathVariable("eid") String eid)
	{
		return projectService.deleteProjectById(id,eid);
	}
}
