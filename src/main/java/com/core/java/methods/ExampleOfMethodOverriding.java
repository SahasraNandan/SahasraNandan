package com.core.java.methods;

class Stud {
    // Method name same but definitions are different called method overriding
    public int add(int a, int b) {

        return a + b;
    }
}
    class Stu extends Stud
    {
        public int add(int a,int b){

            return a+b+a;
        }

}

public class ExampleOfMethodOverriding {

    public static void main(String[] args) {

        Stu st=new Stu();
       int result= st.add(5,6);//out put  16
        System.out.println(result);
    }
}

