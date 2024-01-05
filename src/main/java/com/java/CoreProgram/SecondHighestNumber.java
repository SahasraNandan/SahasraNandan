package com.java.CoreProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] input = {23, 56, 78, 90, 45};


        Integer secondHight = Arrays.stream(input).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHight);


        List<Integer> gt = Arrays.stream(input).boxed()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.print(gt);


        String input1 = "iloveyoujava";

        Map<String, Long> gt1 = Arrays.stream(input1.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.print(gt1);

    }

}





