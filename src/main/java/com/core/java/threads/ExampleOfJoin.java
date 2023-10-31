package com.core.java.threads;
//to join the to thread we are uisng join method and we will run two thread same method that time we are using
//  sycriozation means it will wait one thread run the method  after that other thread will run
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class ExampleOfJoin {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable at = () -> {
            for (int i = 0; i <= 5; i++) {
                c.increment();
            }
        };
        Runnable bt = () -> {
            for (int i = 0; i <=5; i++) {
                c.increment();
            }

        };
        Thread t1= new Thread(at);
        Thread t2= new Thread(bt);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
