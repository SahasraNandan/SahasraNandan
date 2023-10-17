package com.core.java.array;

public class ExampleOfMultiDimensionalArray {

    public static void main(String[] args) {

//multidimensonal array 2 rows and 4 columns

        int num[][] = new int[2][4];
        // with out assign values
        for (int i = 0; i <2; i++) {//rows

            for (int j = 0; j <4; j++) {

                System.out.print(num[i][j]);
            }

            System.out.println();
        }
    }
}
