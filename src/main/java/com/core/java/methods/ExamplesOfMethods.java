package com.core.java.methods;

public class ExamplesOfMethods {


    static class calucator{

        public int add(int n1,int n2){
            int r=n1+n2;
            return r;
        }
        public void printName(){
            System.out.println("NANDAN");
        }

        public String getName(){
            String name="SAHASRA";
            return name;
        }
    }


    public static void main(String arg[]){


        // datetype reference space of strucutre
        calucator cal= new calucator();

        int b= cal.add(4,5);
        String re=cal.getName();
        cal.printName();
        System.out.println("HI NANDAN SAHASHARA"+b);
        System.out.println("HI NANDAN SAHASHARA"+re);
    }


}
