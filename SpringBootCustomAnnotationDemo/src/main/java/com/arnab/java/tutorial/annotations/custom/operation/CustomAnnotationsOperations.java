package com.arnab.java.tutorial.annotations.custom.operation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.arnab.java.tutorial.annotations.custom.ArnabClassLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabConstructorLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabFieldLevel;
import com.arnab.java.tutorial.annotations.custom.ArnabMethodLevel;
import com.arnab.java.tutorial.annotations.custom.CustomAnnotation;
import com.arnab.java.tutorial.annotations.custom.CustomAnnotationDemo;

public class CustomAnnotationsOperations {
	
	public Class<? extends CustomAnnotationDemo> getClass(CustomAnnotationDemo object) {
		return object.getClass();
	}
    
    public void operateCustomAnnotations(Class<? extends CustomAnnotationDemo> demoClass) {
    	CustomAnnotation customAnnotation = (CustomAnnotation) demoClass.getAnnotation(CustomAnnotation.class);
        System.out.println("CustomAnnotation type: " + customAnnotation.annotationType());
        System.out.println("CustomAnnotation value: " + customAnnotation.value());
        System.out.println("CustomAnnotation id: " + customAnnotation.id());
        for(String value: customAnnotation.values()) {
            System.out.println("CustomAnnotation values: " + value);
        }
        System.out.println("CustomAnnotation level: " + customAnnotation.level());
        System.out.println();
    }
    
    public void operateArnabClassLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	 ArnabClassLevel arnabClassLevel = (ArnabClassLevel) demoClass.getAnnotation(ArnabClassLevel.class);
         System.out.println("ArnabClassLevel type: " + arnabClassLevel.annotationType());
         System.out.println("ArnabClassLevel value: " + arnabClassLevel.value());
         System.out.println();
    }
    
    public void operateArnabFieldLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	Field[] fields = demoClass.getDeclaredFields();
        for(Field field: fields) {
        	ArnabFieldLevel arnabFieldLevel = field.getAnnotation(ArnabFieldLevel.class);
        	CustomAnnotation customAnnotationFieldLevel = field.getAnnotation(CustomAnnotation.class);            
            System.out.println("CustomAnnotation Field Level type: " + customAnnotationFieldLevel.annotationType());
            System.out.println("CustomAnnotation Field Level value: " + customAnnotationFieldLevel.value());
            System.out.println("CustomAnnotation Field Level id: " + customAnnotationFieldLevel.id());
            for(String value: customAnnotationFieldLevel.values()) {
                System.out.println("CustomAnnotation Field Level values: " + value);
            }
            System.out.println("CustomAnnotation Field Level level: " + customAnnotationFieldLevel.level());
            System.out.println("ArnabFieldLevel type: " + arnabFieldLevel.annotationType());
            System.out.println("ArnabFieldLevel value: " + arnabFieldLevel.value());
        	
        }
        System.out.println();
    }
    
    @SuppressWarnings("unchecked")
	public void operateArnabConstructorLevel(Class<? extends CustomAnnotationDemo> demoClass) {    	 
    	 Constructor<CustomAnnotationDemo>[] constructors = (Constructor<CustomAnnotationDemo>[]) demoClass.getConstructors();
    	 for(Constructor<CustomAnnotationDemo> constructor: constructors) {
    		 CustomAnnotation customAnnotationConstructorLevel = constructor.getAnnotation(CustomAnnotation.class);
    		 ArnabConstructorLevel arnabConstructorLevel =  constructor.getAnnotation(ArnabConstructorLevel.class);    		 
    		 System.out.println("CustomAnnotation Constructor Level type: " + customAnnotationConstructorLevel.annotationType());
             System.out.println("CustomAnnotation Constructor Level value: " + customAnnotationConstructorLevel.value());
             System.out.println("CustomAnnotation Constructor Level id: " + customAnnotationConstructorLevel.id());
             for(String value: customAnnotationConstructorLevel.values()) {
                 System.out.println("CustomAnnotation Constructor Level values: " + value);
             }
             System.out.println("CustomAnnotation Constructor Level level: " + customAnnotationConstructorLevel.level());             
             System.out.println("ArnabConstructorLevel type: " + arnabConstructorLevel.annotationType());
             System.out.println("ArnabConstructorLevel value: " + arnabConstructorLevel.value());    		 
    	 }
         System.out.println();
    }
    
    public void operateArnabMethodLevel(Class<? extends CustomAnnotationDemo> demoClass) {
    	Method[] methods = demoClass.getDeclaredMethods();
    	for(Method method: methods) {
    		CustomAnnotation customAnnotationMethodLevel = method.getAnnotation(CustomAnnotation.class);
    		ArnabMethodLevel arnabMethodLevel = method.getAnnotation(ArnabMethodLevel.class);
    		System.out.println("CustomAnnotation Method Level type: " + customAnnotationMethodLevel.annotationType());
            System.out.println("CustomAnnotation Method Level value: " + customAnnotationMethodLevel.value());
            System.out.println("CustomAnnotation Method Level id: " + customAnnotationMethodLevel.id());
            for(String value: customAnnotationMethodLevel.values()) {
                System.out.println("CustomAnnotation Method Level values: " + value);
            }
            System.out.println("CustomAnnotation Method Level level: " + customAnnotationMethodLevel.level());
            System.out.println("ArnabMethodLevel type: " + arnabMethodLevel.annotationType());
            System.out.println("ArnabMethodLevel value: " + arnabMethodLevel.value());
    	}
        System.out.println();
    }
	
}
