package com.arnab.java.tutorial.annotations.custom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.java.tutorial.annotations.custom.models.CustomAnnotationDemoObject;
import com.arnab.java.tutorial.annotations.custom.service.CustomAnnotationsService;

@RestController
@RequestMapping(value = "/annotations")
public class CustomAnnotationsController {
	
	@Autowired
	private CustomAnnotationsService service;

	@GetMapping(value = "/custom", produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomAnnotationDemoObject getCustomAnnotationDemoObject() {
		return service.getCustomAnnotationDemoObject();
	}
	
}
