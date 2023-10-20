package com.core.java.keywords;
class D{

    public D (){
        super();//it will the parent class of A. every class parent class is Object class.
        System.out.println(" default D");
    }
    public D (int a){
        super();
        System.out.println(" parameter D");
    }
}
class C extends D{

    public C (){
        super(7);// out put  parameter A and default value B
        System.out.println(" default C");
    }
    public C (int a){
       // super(6);//call the parent call parameterzied consturctor we are using super method
        this();//output default C and Parameter C
        System.out.println(" parameter C");
    }
}
public class ExampleOfThisAndSuperMethod {

    public static void main(String[] args) {


        C b = new C(5);
    }
}
