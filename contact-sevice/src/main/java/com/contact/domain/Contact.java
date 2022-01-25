package com.contact.domain;

public class Contact {

	private String value;
	private String type;
	private Long userId;
	
	public Contact(String value, String type, Long userId) {
		this.value = value;
		this.type = type;
		this.userId = userId;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Contact(String value, String type) {
		this.value = value;
		this.type = type;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
