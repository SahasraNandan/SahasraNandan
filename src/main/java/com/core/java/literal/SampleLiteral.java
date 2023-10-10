package com.core.java.literal;

public class SampleLiteral {
    public static void main(String[] args) {


        int num = 0b101;
        // byte b=128;// error :limtit 127
        int b = 0x7E;
        int sh = 1_00_00_00_000;
        //long l=23345;//error :limtit 127
        double l = 12e10;
//boolean b=1;//error
        char C='a';
        C++;

        System.out.println("Int values+"+num);
        System.out.println("byte values+"+b);
        System.out.println("Short values+"+sh);
        System.out.println("long values+"+l);
        System.out.println("literal values+"+C);
    }
}
