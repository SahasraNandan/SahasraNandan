package com.core.java.enums;

public class ExampleOfSwitchStatement {
    public static void main(String[] args) {
        Status s=  Status.Running;

        switch (s)
        {
            case Running:
            System.out.println("Running");
            break;
            case Success:
                System.out.println("Succe" +
                        "ss");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            default:
                System.out.println("done");
                break;
        }

                }
}
