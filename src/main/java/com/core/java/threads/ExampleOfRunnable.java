package com.core.java.threads;
class ExRun implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class ExRun1 implements Runnable{

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class ExampleOfRunnable {
    public static void main(String[] args) {
        Runnable at=new ExRun1();
       // at.start()//runnable not contains the start method
        Runnable bt=new ExRun();
        Thread t1= new Thread(at);
        Thread t2= new Thread(bt);
        t1.start();
        t2.start();


    }
}
