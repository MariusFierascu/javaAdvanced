package com.sdaacademy.javaadvanced;

import java.awt.*;

public class Rectangle extends Shape {

    private float side1, side2;

    public Rectangle(Color color, float side1, float side2) {
        super("Rectangle", color);
        this.side1 = side1;
        this.side2 = side2;
    }
}
