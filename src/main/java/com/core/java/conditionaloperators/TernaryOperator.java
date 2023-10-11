package com.core.java.conditionaloperators;

public class TernaryOperator {
//if number remider even set 10 and odd set 20
    public static void main(String[] args) {
        int num1 = 35;
        int result=0;
        /*if(num1%2==0)

            result=10;
           //if true then only value print
            else
        result=20;

            System.out.println(result);*/

        result=num1%2==0?10:20;
        System.out.println(result);

    }
}
