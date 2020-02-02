package com.sdaacademy.javaadvanced;

public class MyThread implements Runnable {

    private int theValue;

    public void setTheValue(int theValue) {
        this.theValue = theValue;
    }

    public int getTheValue() {
        return theValue;
    }

    public MyThread(int theValue) {
        this.theValue = theValue;
    }

    @Override
    public void run(){
        while(theValue < 5) {
            System.out.println ("Hello " + theValue);
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }
}

