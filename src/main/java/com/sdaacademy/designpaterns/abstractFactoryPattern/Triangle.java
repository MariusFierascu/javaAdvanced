package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Sunt un triunghi fara culoare");
    }
}
