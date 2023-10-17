package com.core.java.array;

public class ExampleOfMultiDimensionalArrayDynamicValues {

    public static void main(String[] args) {

//multidimensonal array 3 rows and 4 columns

        int num[][] = new int[3][4];
        //  assign values
        for (int i = 0; i < 3; i++) {//rows

            for (int j = 0; j < 4; j++) {


                num[i][j]=(int)(Math.random()*10);
            }

        }
        for (int i = 0; i < 3; i++) {//rows

            for (int j = 0; j < 4; j++) {


                System.out.print(num[i][j]+" ");
            }

            System.out.println();

        }
    }
}