/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.java.tutorial.annotations.custom.CustomAnnotationDemo;
import com.arnab.java.tutorial.annotations.custom.models.CustomAnnotationDemoObject;
import com.arnab.java.tutorial.annotations.custom.operation.CustomAnnotationsOperations;

@Service
public class CustomAnnotationsService {

	@Autowired
	private CustomAnnotationsOperations operations;

	public CustomAnnotationDemoObject getCustomAnnotationDemoObject() {
		CustomAnnotationDemo demo = new CustomAnnotationDemo(1, "Arnab", "Banerjee", "Kolkata", "West Bengal");
		return operations.getCustomAnnotationDemoObject(demo);
	}

}
