package com.core.java.collectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// to sort the values we are using sort method
public class ExampleOfSort {

    public static void main(String[] args) {
        {
            List<Integer> listOfValues = new ArrayList<Integer>();
            listOfValues.add(3);
            listOfValues.add(8);
            listOfValues.add(5);
            listOfValues.add(9);
            System.out.println(listOfValues);
            Collections.sort(listOfValues);//internal comparable interface works
            System.out.println(listOfValues);

        }
    }
}
