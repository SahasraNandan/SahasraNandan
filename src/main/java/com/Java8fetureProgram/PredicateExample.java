package com.Java8fetureProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> p = x->x%2==0;
     System.out.println( p.test(10));

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        list.stream().filter(x->x>1)
                .forEach(l->System.out.println("HI"+l));

    }
}
