package com.sdaacademy.designpaterns.decoratorPattern;

public class Lapte extends BauturaDecorator {

    private final double price = 0.6;

    public Lapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public double decorate() {
        return price + getBautura().decorate();
    }
}
