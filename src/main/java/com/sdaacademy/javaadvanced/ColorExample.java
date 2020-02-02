package com.sdaacademy.javaadvanced;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ColorExample {
    public static void main(String[] args) {
        Set<String> purchases = new HashSet<String>();
        Scanner scanner = new Scanner( System.in );
        while (true) {
            System.out.println( "1.add" );
            System.out.println( "2.remove" );
            System.out.println( "3.print" );
            System.out.println( "Opt:" );
            String opt = scanner.nextLine();
            switch (opt) {
                case "1":
                    System.out.println( "Cumparaturi" );
                    String item = scanner.nextLine();
                    purchases.add( item );
                    break;
                case "2":
                    System.out.println( "Cumparaturi" );
                    item = scanner.nextLine();
                    if (purchases.contains( item )) {
                        purchases.remove( item );
                    }
                    break;
                case "3":
                    System.out.println( purchases );
                    break;
            }
        }
    }
}
