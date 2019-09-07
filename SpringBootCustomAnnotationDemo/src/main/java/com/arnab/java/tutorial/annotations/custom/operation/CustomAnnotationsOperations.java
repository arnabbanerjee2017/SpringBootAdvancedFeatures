/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom.operation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arnab.java.tutorial.annotations.custom.ArnabClassLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabConstructorLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabFieldLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabMethodLevel;
import com.arnab.java.tutorial.annotations.custom.CustomAnnotation;
import com.arnab.java.tutorial.annotations.custom.CustomAnnotationDemo;
import com.arnab.java.tutorial.annotations.custom.models.ArnabClassLevelModel;
import com.arnab.java.tutorial.annotations.custom.models.ArnabConstructorLevelModel;
import com.arnab.java.tutorial.annotations.custom.models.ArnabFieldLevelModel;
import com.arnab.java.tutorial.annotations.custom.models.ArnabMethodLevelModel;
import com.arnab.java.tutorial.annotations.custom.models.ClassLevel;
import com.arnab.java.tutorial.annotations.custom.models.ConstructorLevel;
import com.arnab.java.tutorial.annotations.custom.models.CustomAnnotationDemoObject;
import com.arnab.java.tutorial.annotations.custom.models.CustomAnnotationModel;
import com.arnab.java.tutorial.annotations.custom.models.FieldLevel;
import com.arnab.java.tutorial.annotations.custom.models.MethodLevel;

@Component
public class CustomAnnotationsOperations {
	
	@Autowired
	private CustomAnnotationDemoObject output;
	
	public CustomAnnotationDemoObject getCustomAnnotationDemoObject(CustomAnnotationDemo demo) {
		Class<? extends CustomAnnotationDemo> demoClass = demo.getClass();
		this.operateCustomAnnotations(demoClass);
		this.operateArnabClassLevel(demoClass);
		this.operateArnabFieldLevel(demoClass);
		this.operateArnabConstructorLevel(demoClass);
		this.operateArnabMethodLevel(demoClass);
		return output;
	}
    
    public void operateCustomAnnotations(Class<? extends CustomAnnotationDemo> demoClass) {
    	CustomAnnotation customAnnotation = (CustomAnnotation) demoClass.getAnnotation(CustomAnnotation.class);
        
        CustomAnnotationModel model = new CustomAnnotationModel();
        model.setId(customAnnotation.id());
        model.setLevel(customAnnotation.level());
        model.setValue(customAnnotation.value());
        model.setValues(Arrays.asList(customAnnotation.values()));
        
        ClassLevel classLevel = new ClassLevel();
        classLevel.setCustomAnnotationModel(model);
        
        output.setClassLevel(classLevel);
    }
    
    public void operateArnabClassLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	 ArnabClassLevel arnabClassLevel = (ArnabClassLevel) demoClass.getAnnotation(ArnabClassLevel.class);
         
         ArnabClassLevelModel model = new ArnabClassLevelModel();
         model.setClassMarker(demoClass);
         model.setValue(arnabClassLevel.value());
         output.getClassLevel().setArnabClassLevelModel(model);
         
    }
    
    public void operateArnabFieldLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	Field[] fields = demoClass.getDeclaredFields();
    	
    	FieldLevel fieldLevel = new FieldLevel();
    	
        for(Field field: fields) {
        	ArnabFieldLevel arnabFieldLevel = field.getAnnotation(ArnabFieldLevel.class);
        	CustomAnnotation customAnnotationFieldLevel = field.getAnnotation(CustomAnnotation.class); 
        	
            CustomAnnotationModel model = new CustomAnnotationModel();
            model.setId(customAnnotationFieldLevel.id());
            model.setLevel(customAnnotationFieldLevel.level());
            model.setValue(customAnnotationFieldLevel.value());
            model.setValues(Arrays.asList(customAnnotationFieldLevel.values()));
            fieldLevel.getCustomAnnotationModel().add(model);
            
            ArnabFieldLevelModel fieldModel = new ArnabFieldLevelModel();
            fieldModel.setValue(arnabFieldLevel.value());
            fieldLevel.getArnabFieldLevelModel().add(fieldModel);
            
        }
        
        output.setFieldLevel(fieldLevel);
    }
    
    @SuppressWarnings("unchecked")
	public void operateArnabConstructorLevel(Class<? extends CustomAnnotationDemo> demoClass) {    	 
    	 Constructor<CustomAnnotationDemo>[] constructors = (Constructor<CustomAnnotationDemo>[]) demoClass.getConstructors();
    	 ConstructorLevel constructorLevel = new ConstructorLevel();    	 
    	 
    	 for(Constructor<CustomAnnotationDemo> constructor: constructors) {
    		 CustomAnnotation customAnnotationConstructorLevel = constructor.getAnnotation(CustomAnnotation.class);
    		 ArnabConstructorLevel arnabConstructorLevel =  constructor.getAnnotation(ArnabConstructorLevel.class);    		  
             
             CustomAnnotationModel model = new CustomAnnotationModel();
             model.setId(customAnnotationConstructorLevel.id());
             model.setLevel(customAnnotationConstructorLevel.level());
             model.setValue(customAnnotationConstructorLevel.value());
             model.setValues(Arrays.asList(customAnnotationConstructorLevel.values()));
             constructorLevel.getCustomAnnotationModel().add(model);             
             
             ArnabConstructorLevelModel constructorModel = new ArnabConstructorLevelModel();
             constructorModel.setValue(arnabConstructorLevel.value());
             constructorLevel.getConstructorLevelModel().add(constructorModel);
    	 }
        
         
         output.setConstructorLevel(constructorLevel);
    }
    
    public void operateArnabMethodLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	Method[] methods = demoClass.getDeclaredMethods();
    	
    	MethodLevel methodLevel = new MethodLevel();
    	
    	for(Method method: methods) {
    		CustomAnnotation customAnnotationMethodLevel = method.getAnnotation(CustomAnnotation.class);
    		ArnabMethodLevel arnabMethodLevel = method.getAnnotation(ArnabMethodLevel.class);
            
            CustomAnnotationModel model = new CustomAnnotationModel();
            model.setId(customAnnotationMethodLevel.id());
            model.setLevel(customAnnotationMethodLevel.level());
            model.setValue(customAnnotationMethodLevel.value());
            model.setValues(Arrays.asList(customAnnotationMethodLevel.values()));
            methodLevel.getCustomAnnotationModel().add(model);
            
            ArnabMethodLevelModel methodModel = new ArnabMethodLevelModel();
            methodModel.setValue(arnabMethodLevel.value());
            methodLevel.getMethodLevelModel().add(methodModel);
    	}
        
        output.setMethodLevel(methodLevel);
    }
	
}
