package com.sdaacademy.javaadvanced.camaraReloaded;

import java.util.ArrayList;
import java.util.List;

public class Stelaj {

    private List<Raft> raftList = new ArrayList<Raft>();

    public Stelaj(List<Raft> raftList) {
        this.raftList = raftList;
    }

    public boolean hasSpace(ObiectDePeRaft o) {
        return raftList.stream()
                .anyMatch(r -> r.hasSpace(o));
    }

    public void add(ObiectDePeRaft o) {
        raftList.stream()
                .filter(r -> r.hasSpace(o))
                .findFirst()
                .ifPresent(raft -> raft.add(o));

    }

    @Override
    public String toString() {

        String returnString = "\t Stelaj :  \n";
        return raftList.stream()
                .map(Raft::toString)
                .reduce(returnString, (c, e) -> c + "\n" + e);

    }
}