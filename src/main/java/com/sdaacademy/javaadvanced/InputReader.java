package com.sdaacademy.javaadvanced;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Input:");
                String read = scanner.nextLine();
                try{
                    System.out.println("int->" + Integer.parseInt(read));
                }catch (NumberFormatException e) {
                    System.out.println("double->" + Double.parseDouble(read));
                }
            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Hey! That's not a value ! Try once more");
            }
        }
    }
}
