package com.core.java.operators;

public class AssignmentOperators {


    public static void main(String[] args) {


        int num1 = 1;
        int num2 = 1;
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int rem=num1%num2;
        num1++;//post-increment
        ++num2;//pre increment
  int result=num1++;//fecth the value and then increment;
  int result1=++num2;//increment the value and fetch value


        System.out.println("add values 16+"+add);
        System.out.println("sub values 0+"+sub);
        System.out.println("mul values 64+"+mul);
        System.out.println("div values 1+"+div);
        System.out.println("rem values 0+"+rem);

        System.out.println(num1++);
        System.out.println(++num2);
        System.out.println(result);
        System.out.println(result1);

    }
}
