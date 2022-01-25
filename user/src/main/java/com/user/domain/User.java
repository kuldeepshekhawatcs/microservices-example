package com.user.domain;

import java.util.List;

public class User {

	private Long userId;
	private String name;
	private List<Contact> contacts;
	
	
	public User(Long id, String name, List<Contact> contact) {
		this.userId = userId;
		this.name = name;
		this.contacts = contact;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	
}
