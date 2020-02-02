package com.sdaacademy.designpaterns.decoratorPattern;

public abstract class BauturaDecorator implements Bautura {

    private Bautura bautura;

    public BauturaDecorator(Bautura bautura) {
        this.bautura = bautura;
    }

    public Bautura getBautura() {
        return bautura;
    }
}
