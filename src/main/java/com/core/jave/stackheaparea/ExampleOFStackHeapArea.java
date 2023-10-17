package com.core.jave.stackheaparea;

import com.core.java.methods.ExamplesOfMethods;

public class ExampleOFStackHeapArea {

    static class calucator{
  int num=5;//insatnace varaible store in heap area
        public int add(int n1,int n2){//method are store in heap area add()

            int r=n1+n2;//in side the method varaible or parameters are store in stack area . each method have own stack area
            return r;
        }

    }


    public static void main(String arg[]){


        // datetype reference space of strucutre
        calucator cal= new calucator();// call is referenace varaible it store in statck area and caluctatore object store in heap area in two pare varaible and method
        // like one part num and second part add() it have one particalr address .
        // that address is stroe in the cal reference varaible value.
        // we have create number of object and assign different values of intance variable.

        int b= cal.add(4,5);


        System.out.println("HI NANDAN SAHASHARA"+b);

    }
}
