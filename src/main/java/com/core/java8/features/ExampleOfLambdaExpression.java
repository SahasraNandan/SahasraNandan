package com.core.java8.features;
// call to the SAM  we need to use the lambda expression (->)



@FunctionalInterface
interface FunInter{
    void show();
}

public class ExampleOfLambdaExpression {

    public static void main(String[] args) {
        FunInter fi= ()->System.out.println("In A");
        fi.show();
        };
}
