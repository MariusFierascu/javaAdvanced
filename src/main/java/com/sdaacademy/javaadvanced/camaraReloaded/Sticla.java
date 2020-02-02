package com.sdaacademy.javaadvanced.camaraReloaded;

public class Sticla extends ObiectDePeRaft {

    private String continut;

    public Sticla(String continut, int greutate, int volum) {
        super(greutate, volum);
        this.continut = continut;

    }

    public String getContinut() {
        return continut;
    }

    @Override
    public String toString() {
        return continut + "|" + super.getGreutate();
    }
}
