package com.core.java.collectionAPI;

import java.util.*;

//Map contains the key and values
// put method used add the values into Map
//Map interfaces implements the hashMap and hashTable(synchronized)
//if we work multiple thread and store values we are using hashTable
public class ExampleOfMap {

    public static void main(String[] args) {
        {
            Map<String,Integer> mapOfValues = new HashMap<>();// not synchronized
           // Map<String,Integer> listOfValues = new Hashtable<>();// synchronized
            mapOfValues.put("Nandan",5);
            mapOfValues.put("Sahasra",4);
            mapOfValues.put("Jannu",14);
            mapOfValues.put("Tanvi",11);

            System.out.println(mapOfValues.keySet());
            for (String n : mapOfValues.keySet())

            {
                System.out.println(n+""+mapOfValues.get(n));
            }
        }
    }
    }

