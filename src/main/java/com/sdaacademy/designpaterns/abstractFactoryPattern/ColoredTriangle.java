package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class ColoredTriangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Sunt un triunghi colorat");
    }
}
