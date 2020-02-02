package com.sdaacademy.javaadvanced.camaraReloaded;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class ManagerCamara {

    private static Camara camara;

    public static void main(String[] args) {
        loadStructure();
        loadContinut();
    }


    private static void loadStructure() {

        Map<Integer, List<Raft>> stelajStructure = new HashMap<Integer, List<Raft>>();
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\mariu\\IdeaProjects\\JavaAdvanced\\src\\main\\resources\\StructuraCamara"))) {
            stream.forEach(line -> {

                String[] spitted = line.split(" ");
                // [0] Stelaj
                // [1] #nr
                // [2] Raft
                // [3] #locuri raft
                // [4] maxKgRaft
                // [5] maxVolRaft

                if (spitted[0].equals("Stelaj")) {
                    Raft raft = new Raft(Integer.parseInt(spitted[4]),
                            Integer.parseInt(spitted[5]),
                            Integer.parseInt(spitted[3]));

                    List<Raft> raftList = stelajStructure.get(Integer.parseInt(spitted[1]));
                    if (raftList == null) {
                        raftList = new ArrayList<Raft>();
                        stelajStructure.put(Integer.parseInt(spitted[1]), raftList);
                    }
                    raftList.add(raft);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Stelaj> stelajList = new ArrayList<Stelaj>();
        stelajStructure.keySet().forEach(key -> {
            List<Raft> raftList = stelajStructure.get(key);
            stelajList.add(new Stelaj(raftList));
        });
        camara = new Camara(stelajList);
    }

    private static void loadContinut() {
        List<ObiectDePeRaft> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\mariu\\IdeaProjects\\JavaAdvanced\\src\\main\\resources\\produseDinCamara"))) {
            stream.map(line->line.split(" ")).map(ObiectDePeRaftfactory::build).forEach(opt->opt.ifPresent(camara::add));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(camara);
    }
}