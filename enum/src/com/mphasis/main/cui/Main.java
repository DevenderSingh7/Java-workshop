package com.mphasis.main.cui;

import types.Apple;


import static types.Apple.greenish;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Apple apple;
        apple = greenish;

        System.out.println(apple);
        Apple[] apples = Apple.values();

        for(Apple a:apples){
            System.out.println(a.getPrice());
        }





    }
}
