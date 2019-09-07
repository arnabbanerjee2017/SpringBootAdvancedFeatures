/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom.models;

public class ArnabClassLevelModel {
	private Class<?> classMarker;
	private String value;

	public Class<?> getClassMarker() {
		return classMarker;
	}

	public void setClassMarker(Class<?> classMarker) {
		this.classMarker = classMarker;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
