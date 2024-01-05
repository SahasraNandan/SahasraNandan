package com.java.CoreProgram;

import java.util.stream.IntStream;

public class LimitAndSkip {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20)
                        .skip(3)
                                .limit(15)
                                        .forEach( System.out::println);



    }
}
