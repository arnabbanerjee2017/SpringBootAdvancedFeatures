package com.arnab.java.tutorial.annotations.custom;

import com.arnab.java.tutorial.annotations.custom.operation.CustomAnnotationsOperations;

public class Main {
    public static void main(String[] args) {
        CustomAnnotationDemo demo = new CustomAnnotationDemo(1, "Arnab",
                "Banerjee", "Kolkata", "West Bengal");
        System.out.println(demo);
        System.out.println();
        
        CustomAnnotationsOperations operations = new CustomAnnotationsOperations();

        Class<? extends CustomAnnotationDemo> demoClass = operations.getClass(demo);
        
        operations.operateCustomAnnotations(demoClass);
        
        operations.operateArnabClassLevel(demoClass);
        
        operations.operateArnabFieldLevel(demoClass);
       
        operations.operateArnabConstructorLevel(demoClass);
        
        operations.operateArnabMethodLevel(demoClass);
        
    }
}
