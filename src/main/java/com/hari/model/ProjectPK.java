package com.hari.model;

import java.io.Serializable;

public class ProjectPK  implements Serializable  {

	
	private String id;
	
	private String employeeid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeid;
	}

	public void setEmployeed(String employee_id) {
		this.employeeid = employee_id;
	}
	
	
}