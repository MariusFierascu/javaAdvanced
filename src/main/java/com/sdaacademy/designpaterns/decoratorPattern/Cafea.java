package com.sdaacademy.designpaterns.decoratorPattern;

public class Cafea implements Bautura {

    private final double price = 1;


    @Override
    public double decorate() {
        return price;
    }
}
