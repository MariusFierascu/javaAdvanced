package com.sdaacademy.designpaterns.builderPattern;

public class ChickenBurger implements Item {

    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public double getPrice() {
        return 25;
    }
}
