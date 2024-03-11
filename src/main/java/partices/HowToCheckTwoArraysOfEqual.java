package partices;

import java.util.Arrays;

public class HowToCheckTwoArraysOfEqual {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4};
        int[] num2 = {2, 3, 4, 1};
        int n1=num1.length;
        int n2=num2.length;
        boolean eal=false;
        Arrays.sort(num1);
        Arrays.sort(num2);

        if(n1==n2){
            eal=true;
        }

        for(int i=0;i<n1;i++){

            if(num1[i]==num2[i]){
                eal=true;
            }
        }
        if(eal){
            System.out.println("two arrays equal");
        }
        else{
            System.out.println("two arrays not equal");
        }

    }
}
