package com.sdaacademy.javaadvanced;

import org.junit.Test;

import java.awt.*;

public class ShapeTest {

    @Test
    public void testTheShape() {
        Shape zaShape = new Shape ("Ana Are Mere", Color.BLUE);

        assert  "Ana Are Mere".equals(zaShape.getNume());
        assert Color.BLUE == zaShape.getColor();
        assert 0 == zaShape.aria();
        assert 0 == zaShape.perimetrul();
    }
}