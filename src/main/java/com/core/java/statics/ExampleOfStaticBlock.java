package com.core.java.statics;



    class Demo {
        static String name;
        int roll;
        int age;

        static {//static block call from the class load time. no of objects are created static block and stack varaible call once

            name = "Nandan";
            System.out.println("Static block");
        }

        Demo() {
            roll = 1234;
            age = 45;
            System.out.println("constructor");
        }
    }
        public class ExampleOfStaticBlock {
    public static void main(String[] args) {

        Demo de= new Demo();//output Static block,constructor

        Demo de2= new Demo();//output One Static block, Two time constructor

        //without  create the object we call the class load using class.forname("demo")
    }
    }


