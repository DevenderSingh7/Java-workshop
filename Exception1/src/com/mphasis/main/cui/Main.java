package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            new vote().register(17);
        }
        catch (illegalAgeException e){
            e.printStackTrace();
        }

    }
}
