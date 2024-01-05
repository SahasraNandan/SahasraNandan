package com.Java8fetureProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
     Consumer con=x->System.out.println("Hi"+x);
     con.accept(10);

     List<Integer> list= Arrays.asList(1,2,3,4,5,6);

     list.stream().forEach(l->System.out.println("HI"+l));

    }
}
