package com.core.java.threads;
// sleep method using to waiting  the thread running state some milliseconds
class ASleep extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class BSleep extends Thread
{
    public void run(){//change the method as run
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ExampleOfSleep {

    public static void main(String[] args) {
        ASleep as=new ASleep();

        as.start();
        BSleep bs=new BSleep();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bs.start();


    }

}
