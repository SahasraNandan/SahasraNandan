package com.core.java.statics;



 class cal{
        int n1,n2;
     public int add(int n3,int n4){
          n1=n3+n4;
          n2=n4*n3;
          int n5=n1+n2;
         return n5;
     }
     public static String name(){//In static method non static method variable are not allowed

      String   name="Nandan";
         return name;
     }
     public static int name2(cal ca){
         // we create the obj and passing through reference we call the non static method variable in static method
         int r=ca.n1+ca.n2;

         return r;
     }
    }

public class ExampleOfStaticMethod {
    public static void main(String[] args) {
        cal ca= new cal();
       int b= ca.add(4,5);
       String name= cal.name();
        int name2= cal.name2(ca);



        System.out.println("HI NANDAN SAHASHARA"+b);
        System.out.println("HI NANDAN SAHASHARA"+name);
        System.out.println("HI NANDAN SAHASHARA"+name2);
    }
}
