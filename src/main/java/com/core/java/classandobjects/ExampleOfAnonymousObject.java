package com.core.java.classandobjects;



class Abc{

    public Abc(){
        System.out.println("constructor");
    }
    public  void show(){
        System.out.println("show");
    }
}
public class ExampleOfAnonymousObject {

    public static void main(String[] args) {
        //with out using reference varaible create the object it called Annonymous Object
        //it can not re use we need create each time new object
        new Abc();//out put constructor
        new Abc().show();//out put constructor show
    }

}
