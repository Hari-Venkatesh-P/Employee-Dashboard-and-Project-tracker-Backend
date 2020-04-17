package com.hari.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hari.model.Users;



public interface ValidationRepo extends JpaRepository<Users,String> {

	
	@Transactional
	@Query(value = "select * from user_credentials where id = (?1)",nativeQuery = true)
	Users getUsersById(String id);

	

}