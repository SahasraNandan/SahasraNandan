package com.core.java.exceptions;
//we are the own exception class extends Exception or  RuntimeException


class NandanException extends Exception{

    NandanException(String string){
        super(string);
    }
}

public class ExampleOfUserExcepton {

    public static void main(String[] args) {

        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
                throw new NandanException("div by 0");

        } catch(NandanException e){
            j=18/1;
            System.out.println("default out "+e);//when excetion is occur then only catch block excute

        }

    }
}
