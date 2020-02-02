package com.sdaacademy.designpaterns.abstractFactoryPattern;

public class ShapeFactoryProducer {

    public AbstractShapeFactory getShapeFactory(boolean isColored) {
        if (isColored)
            return new ColoredShapeFactory();
        else
            return new NormalShapeFactory();
    }
}
