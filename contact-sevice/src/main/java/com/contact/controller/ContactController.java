package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.domain.Contact;
import com.contact.service.ContactServiceImpl;


@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactServiceImpl contactService;
	
@GetMapping("/get-contact")
private List<Contact> getContact() {
	return contactService.getContact("");
	
}	
	
}
