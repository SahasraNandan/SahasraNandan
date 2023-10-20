package com.core.java.classandobjects;
 class E
 {
     public void show(){
         System.out.println("E");
     }
 }
class F extends E
{
    public void show(){
        System.out.println("F");
    }
}
class G extends F
{
    public void show(){
        System.out.println("G");
    }
}

public class ExampleOfRunTimePoly {
    public static void main(String[] args) {
        E obj= new E();
        obj=new F();
        obj=new G();// it will act as run time.
        obj.show();
    }



}
