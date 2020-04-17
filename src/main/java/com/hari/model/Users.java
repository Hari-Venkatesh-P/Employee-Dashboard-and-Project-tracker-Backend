package com.hari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="user_credentials")
public class Users {
	
	@Id
	@JsonProperty("id")
	@Column(name="id")
	private String id;

	@JsonProperty("password")
	@Column(name="password")
	private String password;
	
	@JsonProperty("role")
	@Column(name="role")
	private String role;
	
	public Users()
	{
		
	}
	
	public Users(String id2, String string, String string2) {
		this.id = id2;
		this.password = string ; 
		this.role = string2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}