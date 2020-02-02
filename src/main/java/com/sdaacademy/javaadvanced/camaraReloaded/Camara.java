package com.sdaacademy.javaadvanced.camaraReloaded;


import java.util.LinkedList;
import java.util.List;

public class Camara {
    private List<Stelaj> stelajList = new LinkedList<Stelaj>();

    public Camara(List<Stelaj> stelajList) {
        this.stelajList = stelajList;
    }

    public void add(ObiectDePeRaft o) {
        stelajList.stream()
                .filter(s -> s.hasSpace(o))
                .findFirst()
                .ifPresent(s -> s.add(o));
    }

    @Override
    public String toString() {

        String returnString = "Camara : \n";
        return stelajList.stream()
                .map(Stelaj::toString)
                .reduce(returnString, (current, element) -> current + "\n" + element);

    }
}