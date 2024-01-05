package com.java.CoreProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithNumber {
    public static void main(String[] args) {
        int[] input = {23, 56, 28, 90, 45};


          List<String> listValues  = Arrays.stream(input).boxed()
                .map(s->s+"")
                .filter(x->x.startsWith("2"))
                        .collect(Collectors.toList());
        System.out.println(listValues);


    }
}
