package com.Java8fetureProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("Str1");
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.add("Str5");
        list.add("Str6");
      //  list.stream().forEach(l->System.out.println("ERT"+l));
        Map<String,Integer> map= new HashMap<>();
        map.put("abc1",1);
        map.put("abc2",2);
        map.put("abc3",3);
        map.put("abc4",4);
        //map.forEach((key,value)->System.out.println(key+":"+value));
        map.entrySet().stream().filter(x->x.getKey()=="abc4").forEach(obj->System.out.println(obj));



    }
}
