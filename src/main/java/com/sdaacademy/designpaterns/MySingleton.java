package com.sdaacademy.designpaterns;

public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton() {
    }

    public static MySingleton createInstance() {
        if (instance == null) {
            System.out.println("Instantiez");
            instance = new MySingleton();
        }
        return instance;
    }
}