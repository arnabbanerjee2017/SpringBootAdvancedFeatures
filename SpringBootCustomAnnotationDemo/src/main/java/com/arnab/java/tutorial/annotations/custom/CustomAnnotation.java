/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Java annotations properties are also called Elements.
 * It is a custom annotation - CustomAnnotation
 * The elements are -
 * 		value - Just holds the description. The default value mentioned after demonstrating the level.
 * 		id - The ID. The default value mentioned after demonstrating the level.
 * 		values - Just a String array to demonstrate the data type and about the data. The default value mentioned after demonstrating the level.
 * 		level - To denote class level.
 * This annotation is applied at all levels - Class Level, Field Level, Constructor Level, Method Level.
 * Here Method Level is referred to methods - getterm setter and toString.
 * Please refer CustomAnnotationDemo class for details.
 * 
 * @author Arnab
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String value() default "CustomAnnotationDemo class";
    int id() default 1;
    String[] values() default {"The default value at class level."};
    String level() default "Class level.";
}
