package com.core.java.array;




    class students{

        int roll;
        String name;
        int Age;

    }
public class EnhancedLoopForArrayObject {
    public static void main(String[] args) {

        students s1= new students();

        s1.roll=1;
        s1.name="Nandan";
        s1.Age=5;
        students s2= new students();

        s2.roll=2;
        s2.name="Sahasra";
        s2.Age=4;
       students s3= new students();

        s3.roll=3;
        s3.name="Jaanu";
        s3.Age=14;
       students stud[]=new students[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        for(students n:stud){

            System.out.println(n .roll+" "+n.name +" "+n .Age);
        }

    }
}
