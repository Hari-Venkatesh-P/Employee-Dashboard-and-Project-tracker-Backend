package com.hari.model;

public class ApiResponse {

	String status;
	String message;
	String value;
	
	public ApiResponse(String string, String string2) {
		this.status = string;
		this.message = string2;
	}
	
	public ApiResponse(String string, String string2,String s3) {
		this.status = string;
		this.message = string2;
		this.value = s3;
	}
	
	public ApiResponse(String string) {
		this.value = string;
	}

	public String getStatus() {
		return status;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
