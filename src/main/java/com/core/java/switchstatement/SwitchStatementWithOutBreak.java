package com.core.java.switchstatement;

public class SwitchStatementWithOutBreak {

    public static void main(String[] args) {

        int num=1;
        int a=10;
        int b=20;
        int result=0;
        switch(num)
        {
            case 1:
                result=a+b;
                System.out.println("result1+"+result);
            case 2:
                result=a*b;
                System.out.println("result1+"+result);
            case 3:
                result=a/b;
                System.out.println("result1+"+result);
        }

    }
    //OUT PUT
//result1+30
//result1+200
//result1+0

}
