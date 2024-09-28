package com.multithreading.executorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskDriver {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(1);
        for(int i =0 ; i<5 ;i++){
            Runnable worker = new Task("Task No"+i);
            es.execute(worker);
        }
        es.shutdown();
        while(!es.isTerminated()){

        }
        System.out.println("finished all thread");
    }
}
