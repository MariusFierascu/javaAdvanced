package com.sdaacademy.javaadvanced;

import org.junit.Test;

public class DogTest {

    @Test
    public void testConstructor() {
        Dog dog = new Dog("Azor", (byte) 5, "Male", "Ciobanesc", (float) 20.0);
        assert dog.getAge() == (byte) 5;
        assert dog.getWeigth() == 20;

    }

    @Test
    public void testConstructor2() {
        Dog dog = new Dog("Male", "Ciobanesc");
        assert dog.getAge() == (byte) 0;
        assert dog.getWeigth() == 0;
    }

    @Test
    public void setAge() {
        Dog dog = new Dog("Male", "Ciobanesc");
        dog.setAge((byte) -1);
        assert dog.getAge() == 0;

        dog.setAge((byte) 2);
        assert dog.getAge() == (byte) 2;
    }

    @Test
    public void setWeigth() {
        Dog dog = new Dog("Male", "Ciobanesc");
        dog.setWeigth(-1);
        assert dog.getWeigth() == 0;


        dog.setWeigth(10);
        assert dog.getWeigth() == 10;
    }

}
