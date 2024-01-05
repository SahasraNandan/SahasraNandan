package com.java.CoreProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CamparableStudent implements Comparable<CamparableStudent> {

     private int id;
     private String name;

    public CamparableStudent(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(CamparableStudent s) {
        if(id==s.id)
        {
            return 0;
        }
        else if (id > s.id)
        {
            return 1;
        }
        else{
            return -1;
        }

    }

    @Override
    public String toString() {
        return "CamparableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
       List<CamparableStudent> studentList= new ArrayList<>();
        CamparableStudent st1= new CamparableStudent(101,"Nandan");
        CamparableStudent st2= new CamparableStudent(102,"Nandan1");
        CamparableStudent st3= new CamparableStudent(100,"Nandan");
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        Collections.sort(studentList);
        Collections.sort(studentList, new Comparator());

        System.out.println(studentList);


    }
}
