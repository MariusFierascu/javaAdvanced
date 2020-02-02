package com.sdaacademy.designpaterns.strategyPatern2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        double amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
