package com.sdaacademy.designpaterns.observerPattern;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers(String s);

    void postText (String text);
}
