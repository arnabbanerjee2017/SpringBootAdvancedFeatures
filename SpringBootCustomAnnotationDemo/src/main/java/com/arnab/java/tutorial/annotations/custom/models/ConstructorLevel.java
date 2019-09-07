/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom.models;

import java.util.ArrayList;
import java.util.List;

public class ConstructorLevel {
	private List<CustomAnnotationModel> customAnnotationModel;
	private List<ArnabConstructorLevelModel> constructorLevelModel;

	public ConstructorLevel() {
		customAnnotationModel = new ArrayList<>();
		constructorLevelModel = new ArrayList<>();
	}

	public List<CustomAnnotationModel> getCustomAnnotationModel() {
		return customAnnotationModel;
	}

	public void setCustomAnnotationModel(List<CustomAnnotationModel> customAnnotationModel) {
		this.customAnnotationModel = customAnnotationModel;
	}

	public List<ArnabConstructorLevelModel> getConstructorLevelModel() {
		return constructorLevelModel;
	}

	public void setConstructorLevelModel(List<ArnabConstructorLevelModel> constructorLevelModel) {
		this.constructorLevelModel = constructorLevelModel;
	}

}
