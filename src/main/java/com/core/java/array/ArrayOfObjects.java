package com.core.java.array;


    class student{

        int roll;
        String name;
        int Age;

    }
public class ArrayOfObjects {
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
        student  student[]=new student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(int i=0;i<student.length;i++){

            System.out.println(student [i].roll+" "+student [i].name +" "+student [i].Age);
        }

    }


}
