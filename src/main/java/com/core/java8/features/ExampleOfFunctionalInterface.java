package com.core.java8.features;
// funtional Interface contains only one SAM .
// @funtionalInterface if mention in the above  Interface it must be declar the only one method.
@FunctionalInterface
interface FunctionalInter{
    void show();
        }

public class ExampleOfFunctionalInterface
{

    public static void main(String[] args) {
        FunctionalInter fi= new FunctionalInter(){
            public void show(){
                System.out.println("In A");
            }
        };
        fi.show();


    }
}
