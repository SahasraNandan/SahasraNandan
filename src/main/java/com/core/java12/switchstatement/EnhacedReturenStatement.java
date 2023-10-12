package com.core.java12.switchstatement;

public class EnhacedReturenStatement {
    public static void main(String[] args) {

        String day = "Monday";
        String result = "";

        switch (day) {
            case "Sunday":

                System.out.println("7 am");
                break;


            default:
                System.out.println("8 am");
        }
 // not support in java8 in java 12 only support
        /*result=switch (day){
            case "Sunday"-> "6 am";
            case "Monday"-> "7am";
            default->"8 am";
        };*/
    }
}