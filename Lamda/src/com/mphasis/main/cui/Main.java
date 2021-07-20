package com.mphasis.main.cui;



interface Printer{
    public void print(String str);


}
public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer1= new Printer(){
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        printer1.print("India");

        Printer printer2= (str)-> System.out.println(str);
        printer2.print("Canada");

        Printer printer3 = System.out::println;
        printer3.print("Switzerland");
        execute1( (str) -> System.out.println(str)) ;

        execute2((str) -> System.out.println(str) ,"Netherland");
        execute2(System.out::println,"Iceberg");
    }
    public static void execute1(Printer printer){
        printer.print("Germany");
    }

    public static void execute2(Printer printer,String country){
        printer.print(country);
    }
}
