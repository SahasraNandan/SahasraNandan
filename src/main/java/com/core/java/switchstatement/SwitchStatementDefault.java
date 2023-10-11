package com.core.java.switchstatement;

public class SwitchStatementDefault {

    public static void main(String[] args) {
        int num=4;
        int a=10;
        int b=20;
        int result=0;
        switch (num) {
            case 1:
                result = a + b;
                System.out.println("result1+" + result);
                break;
            case 2:
                result = a * b;
                System.out.println("result1+" + result);
                break;
            case 3:
                result = a / b;
                System.out.println("result1+" + result);
                break;

            default:
                System.out.println("num invalid:...");
        }
    }
}
// with out default : num=4 out put: empty
// with default: num=4 num invalid:...
