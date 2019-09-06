package com.arnab.spring.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.swagger.domain.Contact;
import com.arnab.spring.swagger.service.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
	
	@Autowired
	private AddressService service;

	@GetMapping(value = "/get/{id}")
	public Contact getContact(@PathVariable String id) {
		return service.getContact(id);
	}
	
	@GetMapping(value = "/get/all")
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}
	
	@PostMapping(value = "/save")
	public Contact saveContact(@RequestBody Contact contact) {
		return service.save(contact);
	}
	
}
