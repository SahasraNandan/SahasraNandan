package com.java.Interview.MPHASIS;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HowToRemoveChartersinMap {

    public static void main(String[] args) {
        String str="ccoopptt";

       Set<Character> strSet= new LinkedHashSet<Character>();

       for(char s: str.toCharArray()) {
           strSet.add(s);

        }
       StringBuilder sb= new StringBuilder();
       for(char s:strSet){
           sb.append(s);
       }



       String result= sb.toString();
        System.out.println("dupicate values"+result);
    }
}
