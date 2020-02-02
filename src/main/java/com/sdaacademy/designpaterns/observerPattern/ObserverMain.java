package com.sdaacademy.designpaterns.observerPattern;

public class ObserverMain {

    public static void main(String[] args){
        Celebrity celebrity = new Celebrity("Pablo");

        Follower follower1= new Follower("Alex");
        Follower follower2= new Follower("Andrei");
        Follower follower3 = new Follower("Maria");

        celebrity.register(follower1);
        celebrity.register(follower2);
        celebrity.register(follower3);

        celebrity.postText("Am scos un album nou!");
    }
}
