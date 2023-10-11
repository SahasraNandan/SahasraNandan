package com.core.java.switchstatement;

public class SwitchStatementWithBreak {
// beased on number  do the operation
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
                  break;
              case 2:
                  result=a*b;
                  System.out.println("result1+"+result);
                  break;
              case 3:
                  result=a/b;
                  System.out.println("result1+"+result);
                  break;
              }

          }
          // output 30
}
