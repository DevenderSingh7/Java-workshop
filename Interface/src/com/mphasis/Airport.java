package com.mphasis;

import com.mphasis.contract.Flyer;
import com.mphasis.main.cui.Helicopter;
import com.mphasis.main.cui.Seaplane;


public class Airport {

    public static void main(String[] args) {
	// write your code here
        Airport metroAirport= new Airport();
        Helicopter copter= new Helicopter();
        Seaplane plane = new Seaplane();


        metroAirport.givePermission(copter);
        metroAirport.givePermission(plane);
    }
    private  void givePermission(Flyer f){
        f.land();
    }

}
