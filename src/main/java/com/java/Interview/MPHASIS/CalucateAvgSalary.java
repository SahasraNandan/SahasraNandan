package com.java.Interview.MPHASIS;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalucateAvgSalary {

    public static void main(String[] args) {


        ArrayList<Employee> emplist= new ArrayList<>();
        emplist.add(new Employee(1,"Nandan",10000));
        emplist.add(new Employee(2,"Nandan1",20000));
        emplist.add(new Employee(3,"Nandan2",30000));



        Map<Integer,Double> AvgList= emplist.stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(AvgList);

    }
}
