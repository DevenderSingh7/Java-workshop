
package com.mphasis.main.cui;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

class Point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public Point(T x, T y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "Point{" +
                "x=" +x+
                ",y=" +y+
                "}";

    }
}
/*class Task implements Runnable{
    CyclicBarrier latch;
    String name;
    int duration;
    private CountDownLatch barrier;
//    static Logger logger;
//    static {
//        logger=Logger.getLogger(Task.class.getName());
//    }

    public Task(CyclicBarrier latch, String name, int duration){
        this.latch=latch;
        this.duration=duration;
        this.name= name;
    }
    @Override
    public void run(){
        Logger logger=Logger.getLogger(Task.class.getName());
       //logger.log(Level.INFO,Thread.currentThread()+ " Started...");
        logger.log(Level.INFO,name + " Started...");
//        try{
//            latch.await();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }

        try{
           Thread.sleep(duration);
           //barrier.await();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //latch.countDown();
        logger.log(Level.INFO, name+ "Resuming.....");
    }
}
*/


class  Process {
    static Logger logger;
    static {
        logger= Logger.getLogger(Process.class.getName());
    }
    public Process execute1(){
        //System.out.println("execute1");
        logger.log(Level.INFO,"execute1");
        return new Process();

    }

    public Process execute2(){
        //System.out.println("execute2");
        logger.log(Level.INFO,"execute2");
        return new Process();
    }
    public Process execute3(){
        //System.out.println("execute3");
        logger.log(Level.INFO,"execut3");
        return new Process();
    }
    public void execute4(){
        //System.out.println("execute4");
        logger.log(Level.INFO,"execute4");
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        int vCPU=Runtime.getRuntime().availableProcessors();
       /* ExecutorService service= Executors.newFixedThreadPool(vCPU);
        //CountDownLatch latch=new CountDownLatch(3);
        CyclicBarrier barrier= new CyclicBarrier(3);
//        service.execute(new Task(latch,2000));
//        service.execute(new Task(latch,3000));
//        service.execute(new Task(latch,4000));
        service.execute(new Task(barrier,"Task1",2000));
        service.execute(new Task(barrier,"Task2",3000));
        service.execute(new Task(barrier,"Task3",4000));
//        try{
//            latch.await();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        service.shutdown();
*/
        new Process().execute1().execute2().execute3().execute4();
        Logger.getLogger(Main.class.getName()).log(Level.INFO,"End of Main Thread");
    }
}






















/*package com.mphasis.main.cui;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Task implements Callable<Point> {

    AtomicInteger counter;

    Task() {
        counter = new AtomicInteger(1);
    }

    public Point call() throws Exception {
        System.out.println(Thread.currentThread());
        Thread.sleep(0500);

        return new Point(counter.getAndIncrement(), counter.getAndIncrement());
    }
}
public class Main {

    public static void main(String[] args) {
        int vCPU = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(vCPU);
        ArrayList<Future> allFutures = new ArrayList<Future>();
        Task task = new Task();
        //Future<Point> future;
        for(int counter=0; counter<4;counter++) {
            allFutures.add(service.submit(task));
        }
        for (Future<Point> future:allFutures)
        {
            try {
                //future = service.submit(task);
                Point point = future.get();
                System.out.println(point);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            catch (ExecutionException e){
                e.printStackTrace();
            }
        }
        service.shutdown();
        System.out.println("End");

        //Point<Integer> point1 = new Point(2, 4);
        //System.out.println(point1);
        //Point<Float> point2 = new Point<>(2.2f, 4.5f);
        //System.out.println(point2);





    }
}
*/


