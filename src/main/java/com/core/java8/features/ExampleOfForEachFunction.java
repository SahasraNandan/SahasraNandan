package com.core.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// foreach introdu in 1.8  and implements the consumer functional Interface and used the method accept
public class ExampleOfForEachFunction {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7, 9);

       /* Consumer<Integer> com= new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };*/

       // Consumer<Integer> com = (Integer n) -> System.out.println(n);
        list.forEach( n -> System.out.println(n));
    }
}
