package com.core.java.collectionAPI;
// implements comparable


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStudentImp implements Comparable<SortStudentImp>
{
    int age;
    String name;
    SortStudentImp(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "SortStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(SortStudentImp That) {
        if (this.age > That.age) {
            return 1;
        } else {
            return -1;
        }
    }
}


public class ExampleOfComparable {
    public static void main(String[] args) {


            List<SortStudentImp> sortStudentValues = new ArrayList<SortStudentImp>();
            sortStudentValues.add(new SortStudentImp(83, "adb"));
            sortStudentValues.add(new SortStudentImp(45, "dbf"));
            ;
            sortStudentValues.add(new SortStudentImp(56, "rfg"));
            ;
            sortStudentValues.add(new SortStudentImp(27, "ght"));
            ;
            System.out.println(sortStudentValues);
            Collections.sort(sortStudentValues);//user difine logic  work
            System.out.println(sortStudentValues);


    }
}