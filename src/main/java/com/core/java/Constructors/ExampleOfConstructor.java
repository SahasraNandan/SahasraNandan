package com.core.java.Constructors;

    class Emp{

        private int roll;
        private  String name;
        public Emp(){//constructors is special method and assign to the default values, it is same as the class name and no return values evener create
            // the object constructor call each time
            roll=23;
            name="SAHASRA";

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




    public class ExampleOfConstructor {
        public static void main(String[] args) {

            Emp s1 = new Emp();
            s1.setRoll(5);
            s1.setName("Sahasra");

            System.out.println(s1.getRoll()+""+s1.getName());

        }

}
