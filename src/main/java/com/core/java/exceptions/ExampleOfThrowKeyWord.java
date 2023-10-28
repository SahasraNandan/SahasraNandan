package com.core.java.exceptions;
// throw key word used for  to catch the Exception
public class ExampleOfThrowKeyWord {

    public static void main(String[] args) {

    int i=0;
    int j=0;
    try{
        j=18/i;
        if(j==0)
             throw new ArithmeticException("div by 0");

    } catch(Exception e){
        j=18/1;
        System.out.println("default out "+e);//when excetion is occur then only catch block excute

    }
        System.out.println(j);
}
}
