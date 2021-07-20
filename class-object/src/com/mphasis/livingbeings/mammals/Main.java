package com.mphasis.livingbeings.mammals;



public class Main {
    public static void main(String[] args) {
        Man man;
        man=new Man();
        man.lefteye.color= "brown";
        man.righteye.color= "brown";

        man.lefteye.power=3.0;
        man.righteye.power=2.5;

        System.out.println(man.lefteye.color);
    }
}
