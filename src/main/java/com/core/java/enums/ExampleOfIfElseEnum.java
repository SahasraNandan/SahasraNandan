package com.core.java.enums;

public class ExampleOfIfElseEnum {

    public static void main(String[] args) {
        Status s=  Status.Running;

        if(s==Status.Running)
        {
            System.out.println("Running");
        }
        else if (s==Status.Success)
        {
            System.out.println("Success");
        }
        else if(s==Status.Failed)
        {
            System.out.println("Failed");
        }
        else{
            System.out.println("done");
        }
    }
}
