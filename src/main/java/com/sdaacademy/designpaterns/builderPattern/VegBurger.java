package com.sdaacademy.designpaterns.builderPattern;

public class VegBurger implements Item {

    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 22;
    }
}
