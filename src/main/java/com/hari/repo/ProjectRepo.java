package com.hari.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hari.model.Project;
import com.hari.model.ProjectPK;




public interface ProjectRepo extends JpaRepository<Project,ProjectPK>{

	@Transactional
    @Modifying
    @Query(value = "insert into project_details values (?1,?2,?3,?4,?5)",nativeQuery = true)
	void saveFirstProject(String id,String empid,String name,String status,String progress);

	@Transactional
	@Query(value = "select * from project_details where employee_id = (?1)",nativeQuery = true)
	List<Project> findByEmployeeId(String id);

	
	@Transactional
    @Modifying
    @Query(value = "delete from project_details where id = (?1) and employee_id =(?2)",nativeQuery = true)
	void deleteProjectById(String id, String eid);

	
	@Transactional
    @Modifying
    @Query(value = "update project_details set status = (?2) , progress = (?3) where id = (?1) and employee_id =(?4)",nativeQuery = true)
	void updateProject(String id, String status, String progress,String employeeId);

	@Transactional
    @Query(value = "select count(*) from project_details where employee_id = (?1)",nativeQuery = true)
	String getProjectCount(String eid);

}
