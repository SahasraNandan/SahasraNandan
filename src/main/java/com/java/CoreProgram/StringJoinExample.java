package com.java.CoreProgram;

import java.util.Arrays;
import java.util.List;

public class StringJoinExample {

    public static void main(String[] args) {
       List<String> strnumber = Arrays.asList("1","2","3");
        String joinex=String.join("_",strnumber);

        System.out.println(joinex);
    }
}
