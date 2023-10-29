package com.core.java.threads;
// thread is a single unit of task
// thread run paralley multi task at time
// threads are create using  extends thread class and  implements the runnableInterface


class A
{
    public void show(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }

    }
}
class B
{
    public void show(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }

    }
}
class AThread extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
        }

    }
}
class BThread extends Thread
{
    public void run(){//change the method as run
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }

    }
}


public class ExampleOfThread {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.show();
        b.show();  // out put after excute the HI after that Hello will be print it will not run parallel
        AThread at=new AThread();
        BThread bt=new BThread();
        //at.show();// still its not run parallel
       // bt.show();
        at.start();// now both are run parallel
        bt.start();

    }
}

