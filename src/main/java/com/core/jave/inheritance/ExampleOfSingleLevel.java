package com.core.jave.inheritance;

public class ExampleOfSingleLevel {
    public static void main(String[] args) {
        AdvanceCal ad=new AdvanceCal();
        int r1=ad.div(4,7);
        int r2=ad.mul(4,7);
       int r3= ad.add(4,7);
       int r4= ad.sub(4,7);
       System.out.println("add"+r4+"sub"+r3+"mul"+r2+"div"+r1) ;
    }
}
