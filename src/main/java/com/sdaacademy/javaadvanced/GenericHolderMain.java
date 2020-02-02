package com.sdaacademy.javaadvanced;

public class GenericHolderMain {
    public static void main(String[] args) {
        GenericHolder[] arrayOfHolders = new GenericHolder[3];

        GenericHolder<String> stringHolder = new GenericHolder<> ("Ana are mere");
        GenericHolder<Integer> intHolder = new GenericHolder<Integer> (1);
        GenericHolder<Double> doubleHolder = new GenericHolder<Double> (6.0D);



        for(GenericHolder g : arrayOfHolders){
            System.out.println (g);

            arrayOfHolders[0]=stringHolder;
            arrayOfHolders[1]=intHolder;
            arrayOfHolders[2]=doubleHolder;

        }
    }
}
