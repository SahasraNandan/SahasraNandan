package com.core.java.warpclass;

public class ExampleOfAuotUnboxAndUnboxing {
    public static void main(String[] args) {
        Integer num = 7;

        int num1 = num.intValue();//Unboxing means primitive DataType to warpClass

        int num2 = num;// AutoUnBoxing means automataicaly primitive DataTyope to warpClass
        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str);

    }
}