package com.core.jave.inheritance;

public class ExampleOfMulitiLevel {

    public static void main(String[] args) {
        VeryAdvanceCal vad=new VeryAdvanceCal();
        int r1=vad.div(4,7);
        int r2=vad.mul(4,7);
        int r3= vad.add(4,7);
        int r4= vad.sub(4,7);
        double r5= vad.Power(4,7);

        System.out.println("add"+r4+"sub"+r3+"mul"+r2+"div"+r1+""+r5) ;
    }
}
