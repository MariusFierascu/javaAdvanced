package com.sdaacademy.javaadvanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Sarah" , "Mark", "Tyla" , "Ellisha", "Eamonn");
        List<Integer> intList = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23,50);
                list.stream().sorted().filter(name -> name.startsWith("E")).forEach(System.out::println); //pct a si b
                intList.stream().sorted().filter(i -> i>30 &&i <200).forEach(System.out::println); // pct c
                list.stream().sorted().filter(name -> name.startsWith("E")).map(s-> s.toUpperCase()).forEach(System.out::println); // pct d
                list.stream().map(s -> s.substring(1,s.length()-1)).sorted().forEach(System.out::println); // pct e
                list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // pct f
    }
}
