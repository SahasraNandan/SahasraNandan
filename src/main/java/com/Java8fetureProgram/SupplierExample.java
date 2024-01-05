package com.Java8fetureProgram;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier sup=()->"HI JAVA";
        System.out.println(sup.get());

        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
          // using filter it not return any value then default values print using supplier
        System.out.println( list.stream().filter(x->x>10).findAny()
                .orElseGet(sup));
        list.stream().filter(x->x>1)
                .forEach(l->System.out.println("HI"+l));

    }
}
