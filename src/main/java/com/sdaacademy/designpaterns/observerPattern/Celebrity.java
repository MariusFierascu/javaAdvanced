package com.sdaacademy.designpaterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Celebrity implements Subject {

    private String celebrityName;
    private List<Observer> followers = new ArrayList<>();

    public Celebrity(String name) {
        celebrityName = name;
    }

    @Override
    public void register(Observer observer) {
        followers.add(observer);
    }


    @Override
    public void unregister(Observer observer) {
        followers.remove(observer);
    }



    @Override
    public void notifyAllObservers(String text) {
        for (Observer follower : followers) {
            follower.update(celebrityName, text);
        }
    }

    @Override
    public void postText(String text) {
        System.out.println(celebrityName + ":" + text);

        notifyAllObservers(text);
    }
}
