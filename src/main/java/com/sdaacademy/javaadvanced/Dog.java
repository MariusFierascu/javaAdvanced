package com.sdaacademy.javaadvanced;

public class Dog {

    private String name;
    private byte age;
    private String gender;
    private String race;
    private float weigth;

    public Dog(String name, byte age, String gender, String race, float weigth) {  //click dreapta - generate - constructor- selectam pe toate
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weigth = weigth;
    }

    public Dog(String gender, String race) {
        this("", (byte) 0, gender, race, (float) 0.0);
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        if (weigth > 0) {
            this.weigth = weigth;
        }
    }
}
