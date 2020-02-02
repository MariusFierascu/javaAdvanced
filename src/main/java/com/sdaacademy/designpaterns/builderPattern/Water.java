package com.sdaacademy.designpaterns.builderPattern;

public class Water implements Item {

    @Override
    public String getName() {
        return "Water";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
