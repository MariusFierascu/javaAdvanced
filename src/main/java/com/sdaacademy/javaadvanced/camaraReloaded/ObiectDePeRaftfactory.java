package com.sdaacademy.javaadvanced.camaraReloaded;

import java.util.Optional;

public class ObiectDePeRaftfactory {
    public static Optional<ObiectDePeRaft> build(String[] params) {
        switch (params[0]) {
            case "Borcan":
                return Optional.of(new Borcan(params[1], Integer.parseInt(params[2]), Integer.parseInt(params[3])));
            case "Sticla":
                return Optional.of(new Sticla(params[1], Integer.parseInt(params[2]), Integer.parseInt(params[3])));
            case "Cutie":
                switch (params[1]) {
                    case "Borcan":
                        Borcan bor = new Borcan(params[2], Integer.parseInt(params[3]), Integer.parseInt(params[4]));
                        return Optional.of(new Cutie<Borcan>(bor, Integer.parseInt(params[3]), Integer.parseInt(params[4])));
                    case "Sticla":
                        Sticla sti = new Sticla(params[2], Integer.parseInt(params[3]), Integer.parseInt(params[4]));
                        return Optional.of(new Cutie<Sticla>(sti, Integer.parseInt(params[3]), Integer.parseInt(params[4])));
                    default:
                        return Optional.of(new Cutie(params[1], Integer.parseInt(params[2]), Integer.parseInt(params[3])));
                }


        }
        return Optional.empty();
    }
}

