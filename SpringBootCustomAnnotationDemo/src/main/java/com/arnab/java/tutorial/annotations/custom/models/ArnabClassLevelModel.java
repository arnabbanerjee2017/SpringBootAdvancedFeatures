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
