package com.core.java.loop;

public class ExampleInnerForLoop {

    public static void main(String[] args) {

        // first int i=0 excute and condition after excute the block and then increment the value
        for (int i = 1; i <=7; i++)
        {
            System.out.println("DAY "+i) ;

            for(int j=1;j<=9;j++)
            {
                System.out.println("Hours "+(j+8)+"_"+(j+9)) ;
            }
        }
// it is also working fine
      /*  int i=1;
        for(;i<=5;)
        {
            System.out.println("DAY "+i) ;
            i++;
        }*/
// 1.if you excute atleast once in the block usin do while, 2. if you know conditional value then you can use the for loo
// 3. if  you get the file and database and check the condition we can use the while loop.
    }
}
