package com.core.java.methods;

    class calucators{

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

public class ExamplesOfMethods {

    public static void main(String arg[]){


        // datetype reference space of strucutre
        calucators cal= new calucators();

        int b= cal.add(4,5);
        String re=cal.getName();
        cal.printName();
        System.out.println("HI NANDAN SAHASHARA"+b);
        System.out.println("HI NANDAN SAHASHARA"+re);
    }


}
