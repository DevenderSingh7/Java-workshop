package com.mphasis.entities;

import com.mphasis.contract.Flyer;
import com.mphasis.main.cui.Animal;

public class Bird extends Animal implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("Bird takeoff");

    }

    @Override
    public void fly() {
        System.out.println("bird flying");

    }

    @Override
    public void land() {

    }
    public void buildNest(){

    }
    public  void layEggs(){

    }
}
