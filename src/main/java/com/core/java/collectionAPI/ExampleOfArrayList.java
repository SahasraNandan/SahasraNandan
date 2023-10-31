package com.core.java.collectionAPI;

import java.util.ArrayList;
import java.util.List;

// data structure is nothing but collection API in built class and method we have to use in data set and get
// collection is interfaces .List and Queue and Set are extends the collection Interfaces
// ArrayList,linkedList class implements List Interfaces
//DeQueue class implements the Queue Interfaces
// hashSet ,LikedHashSet class implements the Set Interfaces
// collection interfaces not contains indexOf().
// to void the runtime and compile time error we are using Generics
public class ExampleOfArrayList {
    public static void main(String[] args) {
        {
            List<Integer> listOfValues = new ArrayList<Integer>();
            listOfValues.add(1);
            listOfValues.add(4);
            listOfValues.add(5);
            listOfValues.add(6);
            System.out.println(listOfValues.indexOf(4));
            for (int n : listOfValues)

            {
                System.out.println(n);
            }
        }
    }
}
