package com.hari.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.model.ApiResponse;
import com.hari.model.Report;
import com.hari.repo.EmployeeRepo;
import com.hari.repo.ReportRepo;



@Service
public class ReportService {

	
	@Autowired ReportRepo reportRepo;
	
	
	@Autowired EmployeeRepo employeeRepo;
	
	public Optional<Report> getReportById(String id) {
		return reportRepo.findById(id);
	}


	public ApiResponse updateReport(String id, String position, String kpi, String status, String comment) {
		try {
				if(reportRepo.existsById(id))
				{
					reportRepo.updateReport(id,position,kpi,status,comment);
					return new ApiResponse("200","Report updated successfully"," ");
				}
				else
				{
					return new ApiResponse("201","No Report with id "+id," ");
				}
			}catch(Exception e)
			{
				return new ApiResponse("500","Server Problem",""+e);
			}
	}
	
	

}