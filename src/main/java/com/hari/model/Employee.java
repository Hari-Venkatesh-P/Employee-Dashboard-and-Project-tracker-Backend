package com.hari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table (name="employee_details")
public class Employee {

	
	@Id
	@Column(name="id")
	@JsonProperty("id")
	private String id;
	
	
	@Column(name="name")
	@JsonProperty("name")
	private String employeeName;
	
	@Column(name="mobile")
	@JsonProperty("mobile")
	private String employeeMobile;
	
	@Column(name="department")
	@JsonProperty("department")
	private String employeeDepartment;
	
	@Column(name="type")
	@JsonProperty("type")
	private String employeeType;
	
	@Column(name="gender")
	@JsonProperty("gender")
	private String gender;
	
	@Column(name="email")
	@JsonProperty("email")
	private String email;
	
	public String getId() {
		return id;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmployeeId(String employeeId) {
		this.id = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	
}