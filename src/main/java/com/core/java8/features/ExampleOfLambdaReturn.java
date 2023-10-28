package com.core.java8.features;

@FunctionalInterface
interface Bank{
    int add(int i,int j);
}

public class ExampleOfLambdaReturn {
    public static void main(String[] args) {
        Bank fi= (i,j)->i+j;
       int result= fi.add(5,6);

       System.out.println(result);

    }
    }

