package com.core.java.keywords;


// final keyword are using variable,method and class
//it will not change anywhere.
// if you put before the class .class will not be inheritance
//if you put before the Method .method will not be changed
//same varaiable also
class Abc
{
    final public void show(){
        System.out.println("Abc");
    }
    public int add(int a,int b){
       int result =a+b;


        return result;
    }
}
class Bbc extends Abc
{
     /*public void show(){
        System.out.println("Abc"); it will show the error
    }*/
    public int add(int a,int b){
        int result =a+b;


        return result;
    }
}
public class ExampleOfFinalKeyWord {

}
