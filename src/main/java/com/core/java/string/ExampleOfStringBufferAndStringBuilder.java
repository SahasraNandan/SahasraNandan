package com.core.java.string;

public class ExampleOfStringBufferAndStringBuilder {
    //StringBuffer and StringBuilder are mutable we cane chang the string values
    // it will give the  buffer size  of  String

    //diffrence b/w StringBuilder and String Buffer .buffer is thread safe

    public static void main(String[] args) {


        StringBuffer  sb = new StringBuffer ("Nandan");

        sb=sb.append(" Sahasra");
       // sb.deleteCharAt(0);//andan Sahasra
        sb.insert(7,"RAJA ");//Nandan RAJA Sahasra

        System.out.println(sb);

    }
}
