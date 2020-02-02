package com.sdaacademy.designpaterns.builderPattern;

public class MealBuilder {

    public Meal createVegMeal(String type) {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Water());

        return meal;
    }


    public Meal createNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Beer());

        return meal;
    }

    public Meal createVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Water());

        return meal;
    }
}
