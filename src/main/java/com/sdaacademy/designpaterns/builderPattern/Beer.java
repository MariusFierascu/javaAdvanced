package com.sdaacademy.designpaterns.builderPattern;

public class Beer implements Item {

    @Override
    public String getName() {
        return "Beer";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
