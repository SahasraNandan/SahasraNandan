package com.core.java.keywords;

class A{

    public A (){
        super();//it will the parent class of A. every class parent class is Object class.
        System.out.println(" default A");
    }
    public A (int a){
        super();
        System.out.println(" parameter A");
    }
        }
class B extends A{

    public B (){
        super(7);// out put  parameter A and default value B
        System.out.println(" default B");
    }
    public B (int a){
        super(6);//call the parent call parameterzied consturctor we are using super method
        System.out.println(" parameter B");
    }
}




public class ExampleOfSuperMethod {
    public static void main(String[] args) {

        //B b = new B();//output default A and default B
        //B b1 = new B(5);//parameterA and Parameter B
        B b = new B();
    }
}