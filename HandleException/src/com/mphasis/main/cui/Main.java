package com.mphasis.main.cui;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a=0, b=0, c=0;
        Random r = new Random();

        for(int i=0; i<32000; i++) {

            b = r.nextInt();
            c = r.nextInt();
            try {
                a = 12345 / (b / c);
            }catch ( Exception e){
                System.out.println("You can't divide a number by zero");
            }

            a = 0; // set a to zero and continue

            System.out.println("a: " + a);
        }
    }
}


