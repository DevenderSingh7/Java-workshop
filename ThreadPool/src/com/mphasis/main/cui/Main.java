package com.mphasis.main.cui;

import java.util.ServiceConfigurationError;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.*;

class Task implements  Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        int vCore = Runtime.getRuntime().availableProcessors();
        System.out.println(vCore);

        ScheduledExecutorService service = Executors.newScheduledThreadPool(vCore);
        service.scheduleAtFixedRate(new Task(),2,5,TimeUnit.SECONDS);
        //service.schedule(new Task(),2,4, TimeUnit);
//        for(int counter = 0 ;counter<10;counter++){
//           executor.execute(new Task());
//        }
        //executor.shutdown();
    }
}
