package com.sdaacademy.javaadvanced;

public class StopWatchMain {
    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatchThread1 = new StopWatchThread ("T1");
        StopWatchThread stopWatchThread2 = new StopWatchThread ("T2");

        stopWatchThread1.start();
        stopWatchThread2.start();
        System.out.println ("Main thread starts");
        Thread.sleep (5000);
        System.out.println ("Main thread is still running");
        Thread.sleep (5000);
        System.out.println ("Main thread ends");
    }
}

