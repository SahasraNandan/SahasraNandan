package com.core.java.interfaces;
//when declare  the common method in the project we can define diffrent ways it is called inteface.
//it is contains all decalre method only .we need to implements all method.once call the interfce we use the Implements key word
interface Computer
{
    void code();
}
class Desk implements Computer{


    public void code() {
        System.out.println("desk");
    }
}

class Laptop implements Computer{


    public void code() {
        System.out.println("Lap");
    }
}
class Developer
{
    public void desk(Computer com){
        com.code();
    }
}


public class ExampleOfInterface {
    public static void main(String[] args) {

        Computer lap= new Laptop();
        Computer des= new Desk();



        Developer nandan= new Developer();
        nandan.desk(des);

    }
}
