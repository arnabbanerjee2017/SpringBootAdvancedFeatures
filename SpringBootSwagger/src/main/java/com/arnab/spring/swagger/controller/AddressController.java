package com.arnab.spring.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.swagger.domain.Contact;
import com.arnab.spring.swagger.service.AddressService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
	
	@Autowired
	private AddressService service;

	@GetMapping(value = "/get/{id}")
	@ApiOperation(value = "Find a specific contact.",
		notes = "Provide a contact by its id.",
		response = Contact.class,
		produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact(@ApiParam(value = "Id for the contact you want to retrieve.", required = true) @PathVariable String id) {
		return service.getContact(id);
	}
	
	@GetMapping(value = "/get/all")
	@ApiOperation(value = "Find all contacts.",
			notes = "Provide all the contacts.",
			response = List.class,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts() {
		return service.getAllContacts();
	}
	
	@PostMapping(value = "/save")
	@ApiOperation(value = "Save a contact.",
		notes = "Save and provide a contact.",
		response = Contact.class,
		produces = MediaType.APPLICATION_JSON_VALUE,
		consumes = MediaType.APPLICATION_JSON_VALUE)
	public Contact saveContact(@ApiParam(value = "The whole new contact you want to save.", required = true) @RequestBody Contact contact) {
		return service.save(contact);
	}
	
}
