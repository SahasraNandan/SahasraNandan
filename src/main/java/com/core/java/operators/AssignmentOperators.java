package com.core.java.operators;

public class AssignmentOperators {


    public static void main(String[] args) {


        int num1 = 3;
        int num2 = 4;

        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int rem=num1%num2;
     //  num++;//post-increment
      //  ++num3;//pre increment
  int result=num1++;//fecth the value and then increment(number+1);
 int result1=++num2;//increment the value and fetch value(numger+2);


        System.out.println("add values 16+"+add);
        System.out.println("sub values 0+"+sub);
        System.out.println("mul values 64+"+mul);
        System.out.println("div values 1+"+div);
        System.out.println("rem values 0+"+rem);

        System.out.println(num1++);//--4
       System.out.println(++num2);//--6
        System.out.println(result);//3--4
      System.out.println(result1);//5--6

    }
}
