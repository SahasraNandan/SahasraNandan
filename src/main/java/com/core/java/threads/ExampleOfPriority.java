package com.core.java.threads;

// Priority means we need to mention the thread runinning  state min,norm and Max(1-10)


public class ExampleOfPriority {
    public static void main(String[] args) {
        AThread at=new AThread();
        at.setPriority(Thread.MAX_PRIORITY);
        at.start();
        BThread bt=new BThread();
        bt.start();
        bt.setPriority(Thread.MIN_PRIORITY);
    }
}
