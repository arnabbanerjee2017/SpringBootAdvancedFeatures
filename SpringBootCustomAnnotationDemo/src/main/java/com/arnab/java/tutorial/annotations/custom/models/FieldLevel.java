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

public class FieldLevel {
	private List<CustomAnnotationModel> customAnnotationModel;
	private List<ArnabFieldLevelModel> arnabFieldLevelModel;

	public FieldLevel() {
		customAnnotationModel = new ArrayList<>();
		arnabFieldLevelModel = new ArrayList<>();
	}

	public List<CustomAnnotationModel> getCustomAnnotationModel() {
		return customAnnotationModel;
	}

	public void setCustomAnnotationModel(List<CustomAnnotationModel> customAnnotationModel) {
		this.customAnnotationModel = customAnnotationModel;
	}

	public List<ArnabFieldLevelModel> getArnabFieldLevelModel() {
		return arnabFieldLevelModel;
	}

	public void setArnabFieldLevelModel(List<ArnabFieldLevelModel> arnabFieldLevelModel) {
		this.arnabFieldLevelModel = arnabFieldLevelModel;
	}

}
