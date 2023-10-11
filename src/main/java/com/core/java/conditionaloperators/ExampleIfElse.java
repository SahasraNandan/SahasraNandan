package com.core.java.conditionaloperators;

public class ExampleIfElse {

    public static void main(String[] args) {
        int num1 = 3;
        int num3 = 5;
        if (num1 < 4) //if you print single statement {} are not requried
            System.out.println("HellO");//any one statement print true or flase
        else
            System.out.println("bye");

        if (num1 < num3)//if you write or print more then one statement {} are required
          {
           System.out.println("HellO");
           System.out.println("num1");//any one statement print true or flase
          }
       else

            System.out.println("bye");



    }
}
