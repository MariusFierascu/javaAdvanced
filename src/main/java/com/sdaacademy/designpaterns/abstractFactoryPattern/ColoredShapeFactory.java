package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class ColoredShapeFactory implements AbstractShapeFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equals("SQUARE"))
            return new ColoredSquare();
        if (shapeType.equals("TRIANGLE"))
            return new ColoredTriangle();

        return null;
    }
}
