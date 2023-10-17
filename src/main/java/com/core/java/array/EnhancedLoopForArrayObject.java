package com.core.java.array;

public class EnhancedLoopForArrayObject {


    static class student{

        int roll;
        String name;
        int Age;

    }
    public static void main(String[] args) {

        student s1= new student();

        s1.roll=1;
        s1.name="Nandan";
        s1.Age=5;
        student s2= new student();

        s2.roll=2;
        s2.name="Sahasra";
        s2.Age=4;
       student s3= new student();

        s3.roll=3;
        s3.name="Jaanu";
        s3.Age=14;
       student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(student n:students){

            System.out.println(n .roll+" "+n.name +" "+n .Age);
        }

    }
}
