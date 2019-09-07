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

public class MethodLevel {
	private List<CustomAnnotationModel> customAnnotationModel;
	private List<ArnabMethodLevelModel> methodLevelModel;

	public MethodLevel() {
		customAnnotationModel = new ArrayList<>();
		methodLevelModel = new ArrayList<>();
	}

	public List<CustomAnnotationModel> getCustomAnnotationModel() {
		return customAnnotationModel;
	}

	public void setCustomAnnotationModel(List<CustomAnnotationModel> customAnnotationModel) {
		this.customAnnotationModel = customAnnotationModel;
	}

	public List<ArnabMethodLevelModel> getMethodLevelModel() {
		return methodLevelModel;
	}

	public void setMethodLevelModel(List<ArnabMethodLevelModel> methodLevelModel) {
		this.methodLevelModel = methodLevelModel;
	}

}
