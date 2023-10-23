package com.core.java.classandobjects;

import java.util.Objects;

// every class parent class is Object class
// we can override the object class method
//like to-string it is display values by default if want override and use your own code
//equals method to equals the class name parameter values and hashcode also
// hashcode method it will generate the based on the values
class Laptop{
    int price;
   String Model;

   public String toString(){

       return "Hey";
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(Model, laptop.Model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, Model);
    }
}

public class ExampleOfObjectClass {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.price=1000;
        laptop.Model="DELL";
        System.out.println(laptop);//Out put :Laptop@1b6d3586
        //System.out.println(laptop.toString());//Out put :Laptop@1b6d3586
        System.out.println(laptop.toString());//Out put :Hey
    }

}
