package com.core.java12.switchstatement;

public class PasingStringInSwitch {

    public static void main(String[] args) {
        // before only int
//in after java12  string  also support the values
        String day = "Monday";

        switch (day) {
            //case "Staturday", "Sunday": only  in java 12
            case "Sunday":
                System.out.println("6 am");
                break;
            case "Monday":

                System.out.println("7 am");
                break;
            default:
                System.out.println("8 am");
        }
    }
}