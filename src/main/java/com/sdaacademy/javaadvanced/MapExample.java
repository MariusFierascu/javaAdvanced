package com.sdaacademy.javaadvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> purchases = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("1.add");
            System.out.println("2.remove");
            System.out.println("3.print");
            System.out.println("Opt: ");
            String opt = scanner.nextLine();
            switch (opt) {
                case "1":
                    System.out.println("Nume:");
                    String item = scanner.nextLine();
                    System.out.println("Prenume:");
                    String item2 = scanner.nextLine();
                    purchases.put(item, item2);
                    break;
                case "2":
                    System.out.println("Nume:");
                    item = scanner.nextLine();
                    purchases.remove(item);
                    break;
                case "3":
                    System.out.println(purchases);
                    break;
            }
        }
    }
}
