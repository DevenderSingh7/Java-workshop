package com.mphasis;

import com.mphasis.contract.Sailor;
import com.mphasis.entities.RiverBarge;
import com.mphasis.main.cui.Seaplane;

public class Harbor {
    public static void main(String[] args) {
        Harbor bostonHarbor = new Harbor();
        RiverBarge barge = new RiverBarge();
        Seaplane sPlane = new Seaplane();

        bostonHarbor.givePermission(barge);
        bostonHarbor.givePermission(sPlane);

    }
    private  void givePermission(Sailor s){
        s.dock();

    }
}
