package com.core.java.exceptions;
// we have handle multipule Exception using multi catch block and we need to fallow the Hierarchy Exceptions
public class ExampleOfMultiTryCatchException {
    public static void main(String[] args) {
        int i=2;
        int j=20;
        int nums[]= new int[5];
        String str= null;

        try
        {
          j=j/i;//output can not div by zero
         // System.out.println(nums[5]);
           System.out.println(str.length());

        }catch (ArithmeticException e){
            System.out.println("can not div by zero");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array bound Excaption");

        }
        catch (Exception e){//Exception is parent we  put in bottom only
            System.out.println("some went worng");

        }

    }

}
