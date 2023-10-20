package com.core.java.keywords;
    class Employees{

        private int roll;
        private  String name;
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




public class ExampleOfThiskeyword {
        public static void main(String[] args) {

           Employees s1 = new Employees();
            s1.setRoll(5);
            s1.setName("Sahasra");
            //  s1.roll=1; not able to access the private variable directly we can call the method varaible can access;
            System.out.println(s1.getRoll()+""+s1.getName());

        }

}
