package com.hari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@IdClass(ProjectPK.class)
@Table(name="project_details")
public class Project {

	@Id
	@JsonProperty("id")
	@Column(name="id")
	private String id;
	
	@Id
	@JsonProperty("employeeid")
	@Column(name="employee_id")
	private String employeeid;
	
	@JsonProperty("name")
	@Column(name="name")
	private String name;
	
	
	@JsonProperty("status")
	@Column(name="status")
	private String status;
	
	
	@JsonProperty("progress")
	@Column(name="progress")
	private String progress;
	
	public Project()
	{
		
	}
	
	public Project(String string, String id2, String string2, String string3, String string4) {
		this.id = string;
		this.employeeid = id2;
		this.name = string2;
		this.status = string3;
		this.progress = string4;
	}

	public String getId() {
		return id;
	}

	public String getEmployeeId() {
		return employeeid;
	}

	public void setEmployeeId(String employeeid) {
		this.employeeid = employeeid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}


}
