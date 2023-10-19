package com.core.java.classandobjects;

class Employee{

   private int roll;
   private  String name;
    public int getRoll(){

        roll=45;
        return roll;
    }
    public String getName(){

        name="Nandan";
        return name;
    }
    public void setRoll(int a){

        roll=a;

    }
    public void setName(String nam){

        name=nam;

    }
}



public class ExampleOfEncapsulation {


    public static void main(String[] args) {

        Employee s1 = new Employee();
        s1.setRoll(5);
        s1.setName("Sahasra");
        //  s1.roll=1; not able to access the private variable directly we can call the method varaible can access;
       System.out.println(s1.getRoll()+""+s1.getName());

    }

}

