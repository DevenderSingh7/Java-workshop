package com.mphasis.main.cui;


public class Main {

    public static  void main(String[] args) {
	// write your code here
     /*   int num1=0,num2=0;
        num1=Integer.parseInt(args[0]);
        num2=Integer.parseInt(args[1]);

        try{
            System.out.println(num1 / num2);
            System.out.println("End of try Block");

            try{
                System.out.println(num1/num2);
                System.out.println("******End of try block");
            }
            catch (ArithmeticException nfe){
                System.out.println("you can't divide by zero");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Provide two numbers");

        }
        catch (NumberFormatException exception){
            System.out.println("Please Provide a valid number");
        }
        catch (ArithmeticException exception){
            System.out.println("Number can't divide by zero");
        }
        catch (Exception exception){
            System.out.println("Unknown exception"+ exception);
        }
        System.out.println("end")
        */

      try{
          new Test().test1();

      }
      catch (ClassNotFoundException e){
          e.printStackTrace();
      }
        System.out.println("the end");

        }
}
