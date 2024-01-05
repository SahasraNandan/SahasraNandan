package com.java.CoreProgram;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        String[] strarry = {"test", "javate", "lopfgtd", "rtyuiiopf"};


        String longest = Arrays.stream(strarry)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longest);


    }
}