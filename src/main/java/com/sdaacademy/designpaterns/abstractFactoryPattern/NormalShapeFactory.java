package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class NormalShapeFactory implements AbstractShapeFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equals("SQUARE"))
            return new Square();
        if (shapeType.equals("TRIANGLE"))
            return new Triangle();

        return null;
    }
}