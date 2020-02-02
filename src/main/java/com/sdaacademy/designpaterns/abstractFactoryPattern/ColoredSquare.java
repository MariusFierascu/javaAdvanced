package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class ColoredSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Sunt un patrat colorat");
    }
}
