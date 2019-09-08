/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.java.tutorial.annotations.custom;

/**
 * This class is the base class to demonstrate the custom annotations.
 * The annotations used here are - 
 * 		-> @CustomAnnotation
 * 		-> @ArnabClassLevel
 * 		-> @ArnabFieldLevel
 * 		-> @ArnabConstructorLevel
 * 		-> @ArnabMethodLevel
 * 
 * @CustomAnnotation - This annotation is applied at all levels - Class Level, Field Level, Constructor Level, and Method Level.
 * For details, please refer to CustomAnnotation.java. At Class Level, the default values of the elements are assigned. At Field Level,
 * please see the values as defined below just above the fields declarations. Like for 'private Integer id', the elements
 * of the annotation @CustomAnnotation are 'value = "It is the ID of the person.", id = 2, values = {"Integer", "ID"}, level = "Property level"'.
 * 
 * @ArnabClassLevel - This annotation is applied at only Class Level. For details, please refer to ArnabClassLevel.java.
 * At Class Level, the values of the elements of this annotation are assigned as below. Please refer the annotation just above the class.
 * Like for 'private Integer id', the elements of this annotation are - 'value = "Field - ID"'.
 * 
 * @ArnabFieldLevel - This annotation is applied at only Field Level. For details, please refer to ArnabFieldLevel.java.
 * 
 * @ArnabConstructorLevel - This annotation is applied at only Constructor Level. For details, please refer to ArnabConstructorLevel.java.
 * 
 * @ArnabMethodLevel - This annotation is applied at only Method Level. For details, please refer to ArnabMethodLevel.java.
 * 
 * @author Arnab
 *
 */

@ArnabClassLevel(classMarker = CustomAnnotationDemo.class, value = "CustomAnnotationDemo class")
@CustomAnnotation
public class CustomAnnotationDemo {

    @ArnabFieldLevel(value = "Field - ID")
    @CustomAnnotation(value = "It is the ID of the person.", id = 2, values = {"Integer", "ID"}, level = "Property level")
    private Integer id;

    @ArnabFieldLevel(value = "Field - First Name")
    @CustomAnnotation(value = "It is the First Name of the person.", id = 2, values = {"String", "firstName"}, level = "Property level")
    private String firstName;

    @ArnabFieldLevel(value = "Field - Last Name")
    @CustomAnnotation(value = "It is the Last Name of the person.", id = 2, values = {"String", "lastName"}, level = "Property level")
    private String lastName;

    @ArnabFieldLevel(value = "Field - City")
    @CustomAnnotation(value = "It is the City of the person.", id = 2, values = {"String", "city"}, level = "Property level")
    private String city;

    @ArnabFieldLevel(value = "Field - State")
    @CustomAnnotation(value = "It is the State of the person.", id = 2, values = {"String", "state"}, level = "Property level")
    private String state;

    @ArnabConstructorLevel(value = "The parameterized Constructor.")
    @CustomAnnotation(value = "It is the Constructor.", id = 3, values = {"Constructor", "CustomAnnotationDemo"}, level = "Constructor level")
    public CustomAnnotationDemo(Integer id, String firstName, String lastName, String city, String state) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
    }

    @ArnabConstructorLevel(value = "The default Constructor.")
    @CustomAnnotation(value = "It is the default Constructor.", id = 3, values = {"Constructor", "CustomAnnotationDemo"}, level = "Constructor level")
    public CustomAnnotationDemo() {
        super();
    }

    @ArnabMethodLevel(value = "The getter method.")
    @CustomAnnotation(value = "It is the getter - Integer getId().", id = 4, values = {"Getter", "getId"}, level = "Getter level")
    public Integer getId() {
        return id;
    }

    @ArnabMethodLevel(value = "The setter method.")
    @CustomAnnotation(value = "It is the setter - void setId().", id = 5, values = {"Setter", "setId"}, level = "Setter level")
    public void setId(Integer id) {
        this.id = id;
    }

    @ArnabMethodLevel(value = "The getter method.")
    @CustomAnnotation(value = "It is the getter - String getFirstName().", id = 4, values = {"Getter", "getFirstName"}, level = "Getter level")
    public String getFirstName() {
        return firstName;
    }

    @ArnabMethodLevel(value = "The setter method.")
    @CustomAnnotation(value = "It is the setter - void setFirstName().", id = 5, values = {"Setter", "setFirstName"}, level = "Setter level")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @ArnabMethodLevel(value = "The getter method.")
    @CustomAnnotation(value = "It is the getter - String getLastName().", id = 4, values = {"Getter", "getLastName"}, level = "Getter level")
    public String getLastName() {
        return lastName;
    }

    @ArnabMethodLevel(value = "The setter method.")
    @CustomAnnotation(value = "It is the setter - void setLastName().", id = 5, values = {"Setter", "setLastName"}, level = "Setter level")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ArnabMethodLevel(value = "The getter method.")
    @CustomAnnotation(value = "It is the getter - String getCity().", id = 4, values = {"Getter", "getCity"}, level = "Getter level")
    public String getCity() {
        return city;
    }

    @ArnabMethodLevel(value = "The setter method.")
    @CustomAnnotation(value = "It is the setter - void setCity().", id = 5, values = {"Setter", "setCity"}, level = "Setter level")
    public void setCity(String city) {
        this.city = city;
    }

    @ArnabMethodLevel(value = "The getter method.")
    @CustomAnnotation(value = "It is the getter - String getState().", id = 4, values = {"Getter", "getState"}, level = "Getter level")
    public String getState() {
        return state;
    }

    @ArnabMethodLevel(value = "The setter method.")
    @CustomAnnotation(value = "It is the setter - void setState().", id = 5, values = {"Setter", "setState"}, level = "Setter level")
    public void setState(String state) {
        this.state = state;
    }

    @Override
    @ArnabMethodLevel(value = "The toString() method.")
    @CustomAnnotation(value = "It is the toString - String toString().", id = 6, values = {"String", "toString"}, level = "toString level")
    public String toString() {
        return "CustomAnnotationDemo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
