package com.mphasis.entities;

import com.mphasis.contract.Sailor;
import com.mphasis.main.cui.Vehical;

public class RiverBarge extends Airplane implements Sailor {
    @Override
    public void dock() {
        System.out.println("Dock");

    }

    @Override
    public void cruise() {
        System.out.println("Cruise");

    }
}
