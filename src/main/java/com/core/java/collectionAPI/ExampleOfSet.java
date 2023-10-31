package com.core.java.collectionAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//List allow the duplicate values and also it will store data the non order
// set is not allow the duplicate values and also store the values in order
// but set not contains the index,get methods
// we can use the iterator Interfaces for get the values.
public class ExampleOfSet {

    public static void main(String[] args) {
        Set<Integer> setValues= new HashSet<Integer>();// values are store non order only
        //Set<Integer> setValue= new TreeSet<>();// values are store in order wise
        setValues.add(1);
        setValues.add(4);
        setValues.add(5);
        setValues.add(6);

        Iterator getValues= setValues.iterator();
        while (getValues.hasNext())
        {
            System.out.println(getValues.next());
        }

    }
}
