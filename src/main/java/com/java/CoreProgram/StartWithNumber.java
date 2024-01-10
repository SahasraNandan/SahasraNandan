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


       int[] list={1,12,34,56,19};
     List<String> slist =Arrays.stream(list).boxed().map(s->s+"")
                .filter(x->x.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(listValues);



    }
}
