package com.user.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.domain.Contact;
import com.user.domain.User;

@Service
public class UserServiceImpl {

	Contact contact1 = new Contact("7828078451","phone");
	Contact contact2 = new Contact("kuldeepshekhawatcs@gmail.com","email");
	List<Contact> contacts = Arrays.asList(contact1,contact2);
	User user1= new User(1L, "Kuldeep", null);
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<User> getUsers() {
		List<Contact> list = (List<Contact>) restTemplate.getForObject("http://contact-service/contact/get-contact", List.class);
		user1.setContacts(list);
		return Arrays.asList(user1);
	
	}
	
}
