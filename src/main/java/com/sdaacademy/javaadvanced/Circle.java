package com.sdaacademy.javaadvanced;

import java.awt.*;

public class Circle extends Shape {

    private float radius;

    public Circle(Color color, float radius) {
        super("Circle", color);
        this.radius = radius;
    }
}
