package com.arnab.spring.swagger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.arnab.spring.swagger.domain.Contact;

@Service
public class AddressService {

	private Map<Integer, Contact> map;
	
	@PostConstruct
	public void setup() {
		map = new HashMap<>();
		map.put(1, new Contact("640", "Swastik Apartment", "Chembur", "Andheri West", "Andheri", "400014", "Mumbai", 
				"Maharashtra", "India"));
		map.put(2, new Contact("641", "Swastik Apartment", "Chembur", "Andheri West", "Andheri", "400014", "Mumbai", 
				"Maharashtra", "India"));
		map.put(3, new Contact("642", "Swastik Apartment", "Chembur", "Andheri West", "Andheri", "400014", "Mumbai", 
				"Maharashtra", "India"));		
	}
	
	public List<Contact> getAllContacts() {
		List<Contact> list = new ArrayList<>();
		for(Integer key: map.keySet()) {
			list.add(map.get(key));
		}
		return list;
	}
	
	public Contact getContact(String id) {
		return map.get(Integer.parseInt(id));
	}
	
	public Contact save(Contact contact) {
		map.put(map.size() + 1, contact);
		return contact;
	}
	
}
