package com.sdaacademy.javaadvanced;

public class Pocket {

    private float money;

    public Pocket(float money) {
        this.money = money;
    }

    public float getMoney(float askedAmmount) {
        if (money < 10)
            return 0;
        return askedAmmount;
    }

    public void setMoney(float money) {
        if (money >= 0 && money < 3000) {
            this.money = money;
        } else {
            System.out.println("I don't have enough space in my pocket for as much money");
        }
    }
}
