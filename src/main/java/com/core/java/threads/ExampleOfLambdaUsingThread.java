package com.core.java.threads;

public class ExampleOfLambdaUsingThread {
    public static void main(String[] args) {
        Runnable at=()->{
                for(int i=0;i<5;i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        };
        // at.start()//runnable not contains the start method
        Runnable bt=()->{
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        };
        Thread t1= new Thread(at);
        Thread t2= new Thread(bt);
        t1.start();
        t2.start();


    }
}
