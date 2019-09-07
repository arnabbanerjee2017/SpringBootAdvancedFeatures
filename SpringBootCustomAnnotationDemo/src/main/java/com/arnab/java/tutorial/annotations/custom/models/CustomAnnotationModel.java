package com.arnab.java.tutorial.annotations.custom.models;

import java.util.ArrayList;
import java.util.List;

public class CustomAnnotationModel {

	private Integer id;
	private String value;
	private List<String> values;
	private String level;

	public CustomAnnotationModel() {
		super();
		values = new ArrayList<>();
	}

	public CustomAnnotationModel(Integer id, String value, List<String> values, String level) {
		super();
		this.id = id;
		this.value = value;
		this.values = values;
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
