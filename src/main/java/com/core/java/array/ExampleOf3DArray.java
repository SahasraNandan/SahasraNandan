package com.core.java.array;

public class ExampleOf3DArray {

    //three dimensionalArray
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];//jagged Array


        for (int i = 0; i < 3; i++) {//rows

            for (int j = 0; j < 4; j++) {
                for (int K = 0; K < 5; K++) {

                    nums[i][j][K] = (int) (Math.random() * 10);
                }
            }

        }

        for (int n[][] : nums) {
            for (int m[] : n) {
                for (int l : m) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        }
    }
}