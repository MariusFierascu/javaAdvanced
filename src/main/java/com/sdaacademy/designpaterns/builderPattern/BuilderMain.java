package com.sdaacademy.designpaterns.builderPattern;

import java.util.List;

public class BuilderMain {

    public static void main (String[] args){

        MealBuilder mb = new MealBuilder();

        Meal nonVegMeal = mb.createNonVegMeal();

        Meal vegMeal = mb.createVegMeal();

        List<Item> mealItems = nonVegMeal.getMealItems();

        List<Item> mealItemsVeg = vegMeal.getMealItems();

        mealItems.forEach(item -> System.out.println(item.getName()));


    }
}
