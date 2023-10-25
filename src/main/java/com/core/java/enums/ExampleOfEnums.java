package com.core.java.enums;
// it is constans values we need to create  a enum class whenever we need we have create the object instead of string pass the enum values

enum Status{
    Running,Pending,Success,Failed;
}

public class ExampleOfEnums {
    public static void main(String[] args) {
        Status s= Status.Success;
        System.out.println(s);

    }
}
