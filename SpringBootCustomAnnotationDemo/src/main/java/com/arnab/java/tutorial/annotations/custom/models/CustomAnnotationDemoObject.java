package com.arnab.java.tutorial.annotations.custom.models;

import java.util.ArrayList;
import java.util.List;

public class CustomAnnotationDemoObject {

	private ClassLevel classLevel;
	private List<FieldLevel> fieldLevel;
	private List<ConstructorLevel> constructorLevel;
	private List<MethodLevel> methodLevel;

	public CustomAnnotationDemoObject() {
		fieldLevel = new ArrayList<>();
		constructorLevel = new ArrayList<>();
		methodLevel = new ArrayList<>();
	}

	public ClassLevel getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(ClassLevel classLevel) {
		this.classLevel = classLevel;
	}

	public List<FieldLevel> getFieldLevel() {
		return fieldLevel;
	}

	public void setFieldLevel(List<FieldLevel> fieldLevel) {
		this.fieldLevel = fieldLevel;
	}

	public List<ConstructorLevel> getConstructorLevel() {
		return constructorLevel;
	}

	public void setConstructorLevel(List<ConstructorLevel> constructorLevel) {
		this.constructorLevel = constructorLevel;
	}

	public List<MethodLevel> getMethodLevel() {
		return methodLevel;
	}

	public void setMethodLevel(List<MethodLevel> methodLevel) {
		this.methodLevel = methodLevel;
	}

}
