package com.mphasis.main.cui;

class Point{
    public int x;
    public  int y;

}
public class MainApp {

    public static void main(String[] args) {
        Point[] points;
        points =new Point[5];

        points[2]=new Point();

        points[2].x=4;
        points[2].y=5;

        for(Point point : points){
            if(point!=null){
                System.out.println( point.x +"\t" + point.y ) ;
            }
        }


    }

}
