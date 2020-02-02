package com.sdaacademy.designpaterns;

public class Cerc implements FormaGeometrica {

    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public double getArea() {
        return raza * raza * Math.PI;
    }
}
