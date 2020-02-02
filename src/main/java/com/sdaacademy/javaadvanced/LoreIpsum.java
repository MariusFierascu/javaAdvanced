package com.sdaacademy.javaadvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LoreIpsum {

    public static void main(String[] args) {

        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\mariu\\IdeaProjects\\JavaAdvanced\\src\\main\\java\\com\\sdaacademy\\javaadvanced"))) {
            System.out.println(stream.flatMap(lile -> Stream.of(lile.split(""))).count());
        } catch (IOException e) {
        }
    }
}