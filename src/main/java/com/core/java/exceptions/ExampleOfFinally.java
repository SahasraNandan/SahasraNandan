package com.core.java.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// irrespective of Exception finally block is excute
public class ExampleOfFinally {
    public static void main(String[] args) throws IOException {
        int num = 0;
       /* BufferedReader br=null;
        try{
            InputStreamReader in= new InputStreamReader(System.in) ;
            br = new BufferedReader(in);// befferedReader read file ,daatbase
            num=Integer.parseInt(br.readLine());//input 567
            System.out.println(num);//ou

        }
        finally {
            br.close();//to close the resources(file,network call,databaseConnection)
        }
    }*/

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {// automaticaly closed the resources

            num = Integer.parseInt(br.readLine());//input 567
            System.out.println(num);//ou

        }
    }
}



