package com.sdaacademy.designpaterns;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //  MySingleton s1 = MySingleton.createInstance();
        //  MySingleton s2 = MySingleton.createInstance();
        //  MySingleton s3 = MySingleton.createInstance();
        //  MySingleton s4 = MySingleton.createInstance();

        Cerc c1 = new Cerc(2);
        Cerc c2 = new Cerc(2);
        Cerc c3 = new Cerc(2);
        Dreptunghi d1 = new Dreptunghi(2, 4);

        List<FormaGeometrica> formeGeometrice = new ArrayList<>();
        formeGeometrice.add(c1);
        formeGeometrice.add(c2);
        formeGeometrice.add(c3);
        formeGeometrice.add(d1);
        System.out.println(AreaCalculator.calculateArea(formeGeometrice));
    }
}
