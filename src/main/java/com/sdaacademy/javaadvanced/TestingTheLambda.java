package com.sdaacademy.javaadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class TestingTheLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> adding = (i,j) -> i + j;
        System.out.println (adding.apply (1,2));

        BinaryOperator<Integer> substr = (i,j) -> i - j;
        System.out.println (substr.apply (1,2));

        BinaryOperator<Integer> multiply = (i,j) -> i * j;
        System.out.println (multiply.apply (1,2));

        BinaryOperator<Integer> division = (i,j) -> i / j;
        System.out.println (division.apply (1,8));

        List theList = Arrays.asList(1,2,3,4);

        Function<List<Integer>, Integer > sumOfElements = list -> {

            int sum = 0;
            for (Integer i :list)
                sum += i;
            return  sum;
        };
        System.out.println ();
    }
}