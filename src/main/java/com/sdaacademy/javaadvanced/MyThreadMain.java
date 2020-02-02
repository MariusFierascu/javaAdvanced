package com.sdaacademy.javaadvanced;

import java.util.ArrayList;
import java.util.List;
public class MyThreadMain {
    public static void main(String[] args) {
        List<Thread> theThreads = new ArrayList<Thread>();
        MyThread th1 = new MyThread(1);
        theThreads.add(new Thread(th1));
        MyThread th2 = new MyThread(2);
        theThreads.add(new Thread(th2));
        MyThread th3 = new MyThread(3);
        theThreads.add(new Thread(th3));
        MyThread th4 = new MyThread(4);
        theThreads.add(new Thread(th4));
        for (Thread t : theThreads) {
            t.start();
        }
        th1.setTheValue(6);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th2.setTheValue(7);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th3.setTheValue(8);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th4.setTheValue(9);
    }
}
