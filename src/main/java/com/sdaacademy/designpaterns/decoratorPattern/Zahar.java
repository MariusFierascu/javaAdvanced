package com.sdaacademy.designpaterns.decoratorPattern;

public class Zahar extends BauturaDecorator {

    private final double price = 0.5;

    public Zahar(Bautura bautura) {
        super(bautura);
    }


    @Override
    public double decorate() {
        return price + getBautura().decorate();
    }
}
