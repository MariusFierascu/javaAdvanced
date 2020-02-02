package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class ShapeFactoryMain {

    public static void main(String[] args){
        ShapeFactoryProducer shapeFactoryProducer = new ShapeFactoryProducer();

        AbstractShapeFactory coloredShapeFactory = shapeFactoryProducer.getShapeFactory(true);

        Shape coloredTriangle = coloredShapeFactory.getShape("TRIANGLE");

        AbstractShapeFactory normalShapeFactory = shapeFactoryProducer.getShapeFactory(false);

        Shape normalTriangle = normalShapeFactory.getShape("TRIANGLE");

        coloredTriangle.draw();
        normalTriangle.draw();
    }
}
