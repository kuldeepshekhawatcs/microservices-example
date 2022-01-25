package com.contact.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.domain.Contact;

@Service
public class ContactServiceImpl {

	List<Contact> contacts = Arrays.asList(new Contact("7828078451", "phone", 1L),new Contact("kuldeepshekhawatcs@gmail.com", "email", 2L)
			
			);
	
	public List<Contact> getContact(String userId) {
		return contacts;
	}
	
}
