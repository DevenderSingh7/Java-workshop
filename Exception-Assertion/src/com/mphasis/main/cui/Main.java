package com.mphasis.main.cui;

class Arithmatic{
    public int sum(int num1,int num2){
        return num1*num2;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Begin");
        assert (new Arithmatic().sum(2,4)==6):"please check sum mathod in Arithmatic class";
        System.out.println("end");
    }
}
