package com.sdaacademy.designpaterns.strategyPatern2;

public class MainShopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("mere", 10);
        Item item2 = new Item("zacusca", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "1234"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pablo Escobar", "1234567890123456", "786"));
    }
}
