package com.sdaacademy.designpaterns.strategyPatern2;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNr;
    private String cvv;

    public CreditCardStrategy(String name, String cardNr, String cvv){
        this.name=name;
        this.cardNr=cardNr;
        this.cvv=cvv;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount +" paid with credit/debit card by " + name);
    }
}
