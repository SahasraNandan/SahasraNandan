package com.core.java.exceptions;
// try catch block to handle the runtime error ru the application with out any error
// to handle the exception do the other operation
public class ExampleOfTryCatch {
    public static void main(String[] args) {



    int i=0;
    int j=20;
    try{
        j=j/i;

    } catch(Exception e){
        System.out.println("error");//when excetion is occur then only catch block excute

    }
        System.out.println(j);
    }
}
