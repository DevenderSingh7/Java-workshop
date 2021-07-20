package com.mphasis.main.cui;


class Data {
    private  int value;

    public void getValue() {
        System.out.println(value);
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Task implements Runnable{
    Data data;
    public Task(){
        this.data=new Data();

    }

    @Override
    public void run() {
        for(int counter=0;counter<10;counter++){
            Thread curThread= Thread.currentThread();
            System.out.println(curThread+String.valueOf(counter));
            if(curThread.getName().equals("Producer")){
                synchronized (data) { //lock aquired
                    data.setValue(counter);
                    try {
                        data.notify();
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }  //lock released
            }
            else if(curThread.getName().equals("Consumer")){
                synchronized (data) {  // lock aquired
                    data.getValue();
                    try {
                        data.notify();
                        data.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }   // lock released
            }
        }

    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Task task= new Task();
        Thread thread1= new Thread(task,"Producer");
        Thread thread2= new Thread(task,"Consumer");
        thread1.start();
        thread2.start();




    }
}
