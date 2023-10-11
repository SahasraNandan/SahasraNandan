package com.core.java.operators;

public class logicalOperators {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;
        int num3=30;
        int num4=10;
        boolean result=num1<num2&&num3<num4;
        boolean result1=num1>num2||num3<num4;



        System.out.println("result+"+result);// flase
        System.out.println("result+"+result1);//flase
        System.out.println("result3+"+!result);//true

    }
}
