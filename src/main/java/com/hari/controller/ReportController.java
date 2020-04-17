package com.hari.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hari.model.ApiResponse;
import com.hari.model.Report;
import com.hari.service.ReportService;




@CrossOrigin
@RequestMapping("/report")
@RestController
public class ReportController {

	
	@Autowired ReportService  reportService;
	
	@RequestMapping(path="/getreportbyid/{id}" , method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public Optional<Report> getReportById(@PathVariable String id)
	{
		return reportService.getReportById(id);
	}
	
	@RequestMapping(path="/updatereport/{id}/{position}/{kpi}/{status}/{comment}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE )
	public ApiResponse updateReport(@PathVariable("id") String id,@PathVariable("position") String position,@PathVariable("kpi") String kpi,@PathVariable("status") String status,@PathVariable("comment") String comment)
	{
		return reportService.updateReport(id,position,kpi,status,comment);
	}
} 
