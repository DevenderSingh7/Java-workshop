package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

class Point{
    private  int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class Main {

    private static final Logger logger;
    static{
        logger=Logger.getLogger(Main.class.getName());
    }

    public static void main(String[] args) {
	// write your code here
      //  ArrayList<Point> result= new ArrayList<Point>();

//        result.add("A");
//        result.add("T");
//        result.add("T");
//        result.add("U");
//        result.add("V");


      //  String  element =result.get(2);
//        result.add(new Point(2,4));
//        result.add(new Point(3,5));
//        result.add(new Point(4,6));
//        result.add(new Point(5,7));



       // Iterator<Point> iterator= result.iterator();

//        while(iterator.hasNext()){
//            Point point =iterator.next();
//            logger.log(Level.INFO,point.toString());
//        }



//        result.forEach(new Consumer<Point>() {
//            @Override
//            public void accept(Point point) {
//                logger.log(Level.INFO,point.toString());
//            }
//        });
//
//        result.forEach((point) -> logger.log(Level.INFO,point.toString()));


        //LinkedList<String> result= new LinkedList<String>();
        HashSet<String> result= new HashSet<String>();

        result.add("A");
        result.add("B");
        result.add("D");
        result.add("C");
        result.add("A");

        result.forEach(System.out::println);



    }
}
