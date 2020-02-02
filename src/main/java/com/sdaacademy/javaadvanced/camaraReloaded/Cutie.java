package com.sdaacademy.javaadvanced.camaraReloaded;

public class Cutie<T> extends ObiectDePeRaft {

    private T continut;

    public Cutie(T item, int greutate, int volum) {
        super(greutate, volum);
        this.continut = item;

    }
    @Override
    public String toString() {
        return "Cutie [" + continut.toString() + "]";
    }
}
