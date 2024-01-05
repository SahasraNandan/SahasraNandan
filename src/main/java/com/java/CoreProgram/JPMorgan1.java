package com.java.CoreProgram;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JPMorgan1 {

    public static void main(String[] args) {
        String input = "iloVeyoHKavahk";

       String map = Arrays.stream(input.split(""))
                .map(x->x.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet().stream().filter(x->x.getValue()==1)
               .findFirst().get().getKey()

                ;
        System.out.println(map);
    }

}