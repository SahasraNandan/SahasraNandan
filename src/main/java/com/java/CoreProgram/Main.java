package com.java.CoreProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public void one(int i){

    }
    public void one(String i) {

    }





    public static void main(String[] args) {
	// write your code here

        int[] list= {23, 56, 28, 90, 45};

        List<Integer> sortedList= Arrays.stream(list).boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        String input="iloveyoujava";

           Map<String, List<String>> map= Arrays.stream(input.split(""))
                    .collect(Collectors.groupingBy(s->s));

           System.out.println(map.toString());//{a=[a, a], u=[u], e=[e], v=[v, v], y=[y], i=[i], j=[j], l=[l], o=[o, o]}
        Map<String, Long> map1= Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);//{a=2, u=1, e=1, v=2, y=1, i=1, j=1, l=1, o=2}
    }
}
