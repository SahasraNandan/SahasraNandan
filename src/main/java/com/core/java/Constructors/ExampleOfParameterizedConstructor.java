package com.core.java.Constructors;


    class EmpOne{

        private int roll;
        private  String name;
        public EmpOne(){//constructors is special method and assign to the default values, it is same as the class name and no return values evener create
            // the object constructor call each time
            roll=23;
            name="SAHASRA";

        }
        public EmpOne(int roll,String name){//passing parameters
            this.roll=roll;
           this.name=name;

        }

        public int getRoll(){

            roll=45;
            return roll;
        }
        public String getName(){

            name="Nandan";
            return name;
        }
        public void setRoll(int roll){//this key word reference current object obj and we can pass the instance varaible into local variable

            this.roll=roll;

        }
        public void setName(String name){

            this.name=name;

        }
    }




     public class ExampleOfParameterizedConstructor {

        public static void main(String[] args) {

            EmpOne s1 = new EmpOne();
            EmpOne s2 = new EmpOne(25,"Nandan");


            //System.out.println(s1.getRoll()+""+s1.getName());

        }
}
