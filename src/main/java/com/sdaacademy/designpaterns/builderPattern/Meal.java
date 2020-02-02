package com.sdaacademy.designpaterns.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> mealItems = new ArrayList<>();

    public Meal(List<Item> mealItems) {
        this.mealItems = mealItems;
    }

    public Meal() {
    }

    public void addItem(Item item) {

        mealItems.add(item);
    }

    public List<Item> getMealItems() {
        return mealItems;
    }

}
