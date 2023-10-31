package com.core.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// in Stream API we using do the multiple operation in list of data and we are do the operation in original data
// we change into stream and then do the operation
// stream introdu in 1.8 .it will not be reused
public class ExampleOfStreamAPI {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 7, 9);

        Predicate<Integer> p=n->n%2==0;

        Function<Integer,Integer> f=n->n*2;


        /*Stream<Integer> st=list.stream();
        Stream<Integer> s1=st.filter(n->n%2==0);
        Stream<Integer> s2=s1.map(n->n*2);
       int result= s2.reduce(0,(c,e)->c+e);*/





        int result= list.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);

        System.out.println(result);


    }
}
