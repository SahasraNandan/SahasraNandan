package com.core.java.array;

public class JaggedArrayExample {

    //in the array size not fixed it will different of size
    public static void main(String[] args) {
        int nums[][]=new int[4][];//jagged Array
        nums[0]=new int[4];
        nums[1]=new int[3];
        nums[2]=new int[2];
        nums[3]=new int[1];


        for (int i = 0; i <nums.length; i++) {//rows

            for (int j = 0; j < nums[i].length; j++) {


                nums[i][j]=(int)(Math.random()*10);
            }

        }

        for(int n[]:nums)
        {
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
