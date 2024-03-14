package com.java.Interview.MPHASIS;

import java.util.*;

public class HowtofindthelistofintegerdupicateIntegervalues {

    public static void main(String[] args) {

        List<Integer> arryList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7,7);
        String[] str= {"aa","bb","aa","cc","aa"};
        List<String> strList =Arrays.asList(str);
        Map<Integer,Integer> dup= new HashMap<Integer,Integer>();
        List<Integer> dupList= new ArrayList<>();

        for(Integer x:arryList ){
            if(dup.containsKey(x)){
                dupList.add(x);
            }
            else{
                dup.put(x,1);
            }
        }
        System.out.println("dupicate values"+dupList);


    }
}