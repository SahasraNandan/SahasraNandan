package com.core.java.loop;

public class ExampleForLoop {
    // print the values in asc and dsc order
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
          System.out.println("number asc"+i) ;
        }

        for(int i=10;i>=1;i--)
        {
            System.out.println("number dsc"+i) ;
        }
    }
}
