package com.core.java.warpclass;
// primitive type (perfomance vise good) are normal dataType wapClass(in calloction) means Object class

// int -integerClass,Char-CharaterClass,double-Double Class
public class ExampleOfAutoBoxingAndBoxing {

    public static void main(String[] args) {
        int num=7;
        Integer num1= new Integer(num);//Boxing means primitive DataType to warpClass
        Integer num2=num;// AutoBoxing means automataicaly primitive DataTyope to warpClass
        System.out.println(num2);


        String str="12";
        int num3=Integer.parseInt(str);

    }

}
