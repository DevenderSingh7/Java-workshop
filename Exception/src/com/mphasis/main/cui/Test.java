package com.mphasis.main.cui;

public class Test {

    public void test1() throws ClassNotFoundException {
        test2();
    }
    public void test2() throws ClassNotFoundException {
        try{
            test3();
        }
        catch (NumberFormatException exception){
            System.out.println("Invalid Number");
        }
        System.out.println("test2");
    }
    public void test3() throws ClassNotFoundException {
        test4();
        System.out.println("test3");

    }
    public void test4() throws ClassNotFoundException {
       Class.forName("java.util.Date");
        System.out.println("test4");
    }
}
