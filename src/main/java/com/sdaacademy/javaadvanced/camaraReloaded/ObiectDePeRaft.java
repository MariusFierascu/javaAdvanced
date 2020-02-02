package com.sdaacademy.javaadvanced.camaraReloaded;

public abstract class ObiectDePeRaft {
   private int greutate;
   private int volum;

    public ObiectDePeRaft(int greutate, int volum) {
        this.greutate = greutate;
        this.volum = volum;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getVolum() {
        return volum;
    }
}
