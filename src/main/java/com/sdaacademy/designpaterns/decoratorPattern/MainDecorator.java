package com.sdaacademy.designpaterns.decoratorPattern;

public class MainDecorator {

    public static void main(String[] args) {
        Bautura cafea = new Cafea();
        System.out.println(cafea.decorate());

        Bautura cafeaCuLapte = new Lapte(new Cafea());

        System.out.println(cafeaCuLapte.decorate());

        Bautura cafeaCuLapteSiZahar = new Zahar(new Lapte(new Cafea()));

        System.out.println(cafeaCuLapteSiZahar.decorate());

        // MAI JOS E EXEMPLU DE FACTORY, PENTRU A NU MAI SCRIE NEW..(NEW..(NEW..) DE MULTE ORI. SI CLASA MyBauturaFactory face parte de aici

        BauturaFactory bf = new MyBauturaFactory();

        Bautura cafeaDubluLapte = bf.createBautura(BauturaType.CAFEA_DUBLU_LAPTE);

        System.out.println(cafeaDubluLapte.decorate());
    }
}
