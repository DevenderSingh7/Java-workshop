package com.mphasis.main.cui;

//class Task implements Runnable{
//    @Override
//    public void run() {
//        Thread curThread = Thread.currentThread();
//        for(int count=0;count<10;count++){
//            System.out.println(curThread +String.valueOf(count));
//        }
//    }
//
//
//}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
        Runnable task =new Runnable() {
            @Override
            public void run() {

                    Thread curThread = Thread.currentThread();
                    for(int count=0;count<10;count++){
                        System.out.println(curThread +String.valueOf(count));

                }
            }
        };

        //mainThread.setPriority(Thread.MAX_PRIORITY);
        //System.out.println(mainThread);

       // Task task = new Task();

        Thread thread1=new Thread(task,"Thread1");

        Thread thread2=new Thread(task,"Thread2");

        System.out.println(thread1.getState());

        thread1.start();
        thread2.start();

        try {
            //mainThread.sleep(2000);
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
        System.out.println("End");
    }
}
