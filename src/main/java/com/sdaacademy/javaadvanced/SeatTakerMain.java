package com.sdaacademy.javaadvanced;

public class SeatTakerMain {
    public static void main(String[] args) throws InterruptedException {
        Bench bench = new Bench (1); // creating bench with one free seat SeatTakerThread seatTaker1 = new SeatTakerThread(bench); SeatTakerThread seatTaker2 = new SeatTakerThread(bench); seatTaker1.start(); seatTaker2.start();
    }

}
