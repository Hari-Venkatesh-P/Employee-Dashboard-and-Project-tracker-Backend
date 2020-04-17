package com.hari;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.hari.repo")
@EntityScan(basePackages = "com.hari.model")
@ComponentScan(basePackages = { "com.hari.controller","com.hari","com.hari.service"} )
@SpringBootApplication
public class EmployeeDashboardandProjectTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDashboardandProjectTrackerApplication.class, args);
	}

}
