package com.core.java.methods;

public class ExampleOfMethodOverloading {


    //Same method name diffrent parameters  and diffrent datatype is called mathod overloding
    static class calucator{

        public int add(int n1,int n2){
            int r=n1+n2;
            return r;
        }
        public int add(int n1,int n2,int n3,int n4){
            int r=n1+n2+n3+n4;
            return r;
        }

        public double add(double n1,int n2 ,int n3){

            double r=n1+n2+n3;
            return r;
        }
    }


    public static void main(String arg[]){


       calucator cal= new calucator();

        int b= cal.add(4,5,7,8);
        int re=cal.add(2,3);
        double c=cal.add(5.6,6,7);

        System.out.println("HI NANDAN SAHASHARA"+b);
        System.out.println("HI NANDAN SAHASHARA"+re);
        System.out.println("HI NANDAN SAHASHARA"+c);
    }
}
