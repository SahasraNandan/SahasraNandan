package com.core.java12.switchstatement;

public class EnhancedBreakStatement {
    public static void main(String[] args) {

        String day = "Monday";

        switch (day) {

           // case "Sunday"-> System.out.println("6 am"); not support in java 8
            case "Sunday":

                System.out.println("7 am");
                break;

            case "Monday":

                System.out.println("7 am");
                break;
            default:
                System.out.println("8 am");
        }
    }
}
