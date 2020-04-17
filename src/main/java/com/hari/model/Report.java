package com.hari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="employee_reports")
public class Report {

	@Id
	@JsonProperty("id")
	@Column(name="id")
	private String id;
	

	@JsonProperty("kpi")
	@Column(name="kpi")
	private String kpi;
	

	@JsonProperty("status")
	@Column(name="status")
	private String status;
	

	@JsonProperty("comment")
	@Column(name="comment")
	private String comment;
	

	@JsonProperty("position")
	@Column(name="position")
	private String position;

	public Report()
	{
		
	}
	
	
	public Report(String id2, String string, String string2, String string3, String string4) {
		this.id = id2;
		this.kpi = string;
		this.status = string2;
		this.comment = string3;
		this.position = string4;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getKpi() {
		return kpi;
	}


	public void setKpi(String kpi) {
		this.kpi = kpi;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
}