package com.sdaacademy.javaadvanced.camaraReloaded;

import java.util.ArrayList;
import java.util.List;

public class Raft {
    private int greutateMax;
    private int volumMax;
    private int locuriMax;

    private List<ObiectDePeRaft> obiectDePeRaftList = new ArrayList<ObiectDePeRaft>();

    public Raft(int greutateMax, int volumMax, int locuriMax) {
        this.greutateMax = greutateMax;
        this.volumMax = volumMax;
        this.locuriMax = locuriMax;
    }

    public boolean hasSpace(ObiectDePeRaft o) {
        int gTotal = obiectDePeRaftList.stream()
                .mapToInt(el ->el.getGreutate())
                .reduce(0,(c,e)-> c+e);

        int vTotal = obiectDePeRaftList.stream()
                .mapToInt(el ->el.getVolum())
                .reduce(0,(c,e)-> c+e);

        return obiectDePeRaftList.size() < locuriMax
                && (gTotal + o.getGreutate()< greutateMax)
                && (vTotal+ o.getVolum() < volumMax);
    }

    public void add(ObiectDePeRaft o) {
        if (this.hasSpace(o)) {
            obiectDePeRaftList.add(o);
        }
    }

    @Override
    public String toString() {
        String returnString = "Raft : ";
        return obiectDePeRaftList.stream()
                .map(ObiectDePeRaft::toString)
                .reduce(returnString, (c, e) -> c + "\t" + e);

    }
}
