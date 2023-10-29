package com.core.java.firstSample;

import java.io.*;
import java.util.Scanner;

// user enter the  values we are using some pre defined class
public class ExampleOfInputStreamAndOutPutStream {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter the Values");
       int x= System.in.read();//this  method required checked exception and also read enter values
       // System.out.println(x);//it will print the ASCII values
       // System.out.println(x-48);//it will print the normal values only single digit values only we can use like this we over come this problem
        //buffreReder will introdu

        InputStreamReader in= new InputStreamReader(System.in) ;
        BufferedReader br= new BufferedReader(in);// befferedReader read file ,daatbase
        int num=Integer.parseInt(br.readLine());//input 567
        System.out.println(num);//output 567
        br.close();//we need to close the Buffered readr
       // better on
        Scanner sc= new Scanner(System.in);// get the data from file and user and database

        int num1=sc.nextInt();
        System.out.println(num1);


    }
}
