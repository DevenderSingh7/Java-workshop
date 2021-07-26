package com.mphasis.main.cui;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread thread1=new Thread();
        try {
            thread1.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
