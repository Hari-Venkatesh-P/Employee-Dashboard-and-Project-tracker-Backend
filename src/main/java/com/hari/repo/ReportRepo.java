package com.hari.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hari.model.Report;



public interface ReportRepo extends JpaRepository<Report,String> {

	
	@Transactional
    @Modifying
    @Query(value = "update employee_reports set status = (?4) , comment = (?5) , kpi =  (?3) , position =  (?2) where id = (?1) ",nativeQuery = true)
	void updateReport(String id, String position, String kpi, String status, String comment);

}