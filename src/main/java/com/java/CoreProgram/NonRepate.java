package com.java.CoreProgram;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepate {

    //java program to find all duplicate element from a given string?
    public static void main(String[] args) {
        String input = "iloveyoujava";


        String nonrepeat = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(nonrepeat);
    }
}