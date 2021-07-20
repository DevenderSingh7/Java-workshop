package com.mphasis.entities;

import com.mphasis.contract.Flyer;
import com.mphasis.main.cui.Vehical;

public class Airplane extends Vehical implements Flyer {

    @Override
    public void takeOff() {
        System.out.println("Aeroplane takeoff");

    }

    @Override
    public void fly() {
        System.out.println("Aeroplane fling");


    }

    @Override
    public void land() {
        System.out.println("Aeroplane landed");
    }
}
