package com.core.java.statics;



public class ExampleOfStaticVaraible {
    static class student{

        int roll;
        String name;
         static int age;//static varaiable means class variable we can call direcrly use class name no need to create object for call the static variable.

    }
    public static void main(String[] args) {

       student s1= new  student();

        s1.roll=1;
        s1.name="Nandan";
        student.age=23;
      student s2= new student();

        s2.roll=2;
        s2.name="Sahasra";
        student.age=42;

System.out.println(student.age);
    }
}
