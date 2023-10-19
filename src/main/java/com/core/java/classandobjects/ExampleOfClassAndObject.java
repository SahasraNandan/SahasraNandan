package com.core.java.classandobjects;



    class calucator{

       public int add(int n1,int n2){
         int r=n1+n2;
           return r;
       }
   }

public class ExampleOfClassAndObject {

    public static void main(String arg[]){


       // datetype reference space of strucutre
       calucator cal= new calucator();

      int b= cal.add(4,5);

        System.out.println("HI NANDAN SAHASHARA"+b);
    }




}
