package com.Java8fetureProgram;

public class SampleExampleOfLamdaExpression {

    public static void main(String[] args) {

        //Calucator cal=()->System.out.println("Hi");
        //cal.swithOn();


      // Calucator cal=(intput)->System.out.println("Hi"+intput);
       // cal.swithOn(567);
        Calucator cal=(int i,int j)->
                i-j;
       System.out.println(cal.substract(60,30));
    }
}
