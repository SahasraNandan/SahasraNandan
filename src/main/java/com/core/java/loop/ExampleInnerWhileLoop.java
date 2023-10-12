package com.core.java.loop;

public class ExampleInnerWhileLoop {



    public static void main(String[] args) {
        // repeate the values mulitiple times using loos

        int i = 1;
        while(i<=7)
        {
            System.out.println("HellO"+i);
            int j=1;
             while(j<=24)
             {
                 System.out.println("Hour"+j);
                 j++;
             }
            i++;
        }

        System.out.println("bye"+i);

    }
}
