package com.Java8fetureProgram;

import java.util.stream.IntStream;

public class parallelStreamExample {
    public static void main(String[] args) {
        long start=0;
        long end=0;
        start=System.currentTimeMillis();

        IntStream.range(1,100).forEach(System.out::println);

        end=System.currentTimeMillis();

        System.out.println("plain Stream"+(end-start));
        start=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);

        end=System.currentTimeMillis();

        System.out.println("parallel Stream"+(end-start));

    }
}
