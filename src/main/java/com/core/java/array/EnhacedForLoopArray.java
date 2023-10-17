package com.core.java.array;

public class EnhacedForLoopArray {

    //multidimensonal array 3 rows and 4 columns
    public static void main(String[] args) {
    int num[][] = new int[3][4];
    //  assign values
        for (int i = 0; i < 3; i++) {//rows

        for (int j = 0; j < 4; j++) {


            num[i][j]=(int)(Math.random()*10);
        }

    }
        for (int n[]: num) {//rows

        for (int m:n) {


            System.out.print(m+" ");
        }

        System.out.println();

    }
}
}
