package com.core.java.Casting;
// to call the subclass values we are using downcasting

class Super
{
    public void Show(){
        System.out.println("in A");
    }
}
class Sub extends Super
{
    public void Show1(){
        System.out.println("in B");
    }
}


public class ExampleOfDownCasting {

    public static void main(String[] args) {
        //Super sup= new Super();

        // sup.Show1();//it will show the error because efg don't know the method of Ijk class
        Super sup=(Super) new Sub();
         Sub   su= (Sub)sup;
         su.Show1();


    }
}
