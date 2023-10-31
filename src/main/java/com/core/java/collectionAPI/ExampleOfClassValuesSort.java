package com.core.java.collectionAPI;
// we are using sort method passing object values also

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStudent
{
    int age;
    String name;
    SortStudent(int age,String name){
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
}

public class ExampleOfClassValuesSort {
    public static void main(String[] args) {

     /*   Comparator<SortStudent> com= new Comparator<SortStudent>() {

            public int compare(SortStudent i, SortStudent j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };*/

        Comparator<SortStudent> com= (i, j) -> { // using lambda expession
            if (i.age > j.age) {
                return 1;
            } else {
                return -1;
            }

        };

        {
            List<SortStudent> sortStudentValues = new ArrayList<SortStudent>();
            sortStudentValues.add( new SortStudent(83,"adb"));
            sortStudentValues.add( new SortStudent(45,"dbf"));;
            sortStudentValues.add( new SortStudent(56,"rfg"));;
            sortStudentValues.add( new SortStudent(27,"ght"));;
            System.out.println(sortStudentValues);
            Collections.sort(sortStudentValues,com);//user difine logic  work
            System.out.println(sortStudentValues);

        }
    }
}
