package com.core.java.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// we write code which logic data will sort using Comparator interface and compare method
public class ExampleOfCustomSort {


    public static void main(String[] args) {

        Comparator<Integer> com= new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

        {
            List<Integer> listOfValues = new ArrayList<Integer>();
            listOfValues.add(34);
            listOfValues.add(81);
            listOfValues.add(53);
            listOfValues.add(98);
            System.out.println(listOfValues);
            Collections.sort(listOfValues,com);//user difine logic  work
            System.out.println(listOfValues);

        }
    }
}
