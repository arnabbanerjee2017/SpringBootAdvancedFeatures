/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom.models;

import org.springframework.stereotype.Component;

@Component
public class CustomAnnotationDemoObject {

	private ClassLevel classLevel;
	private FieldLevel fieldLevel;
	private ConstructorLevel constructorLevel;
	private MethodLevel methodLevel;

	public ClassLevel getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(ClassLevel classLevel) {
		this.classLevel = classLevel;
	}

	public FieldLevel getFieldLevel() {
		return fieldLevel;
	}

	public void setFieldLevel(FieldLevel fieldLevel) {
		this.fieldLevel = fieldLevel;
	}

	public ConstructorLevel getConstructorLevel() {
		return constructorLevel;
	}

	public void setConstructorLevel(ConstructorLevel constructorLevel) {
		this.constructorLevel = constructorLevel;
	}

	public MethodLevel getMethodLevel() {
		return methodLevel;
	}

	public void setMethodLevel(MethodLevel methodLevel) {
		this.methodLevel = methodLevel;
	}

}
