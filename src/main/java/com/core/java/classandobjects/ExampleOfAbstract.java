package com.core.java.classandobjects;
// if we declare the method and difine in other class. that time before method we add the abstrsct keyword and add the class also.

//if we extends the abstract class we need difine the abstract method if not difine the all method that class also abstract class.

// all abstract method are difine that class called the concret class.abstract class we are not able to create the object.
// in abstart class it contains abstract method are not. also cantian the normal methods
abstract class Car {
    abstract public void drive();

    abstract public void fly();

    public void palyMusic() {
        System.out.println("Paly");
    }
}
    abstract class AvdCar extends Car{
         public void drive(){
             System.out.println("drive");
         }
    }
    class VadCar extends AvdCar{
        public void fly(){
            System.out.println("fly");
        }
    }



public class ExampleOfAbstract {
    public static void main(String[] args) {
        VadCar vad= new VadCar();
        vad.fly();
    }
}
