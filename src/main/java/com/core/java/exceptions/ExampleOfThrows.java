package com.core.java.exceptions;
// throws are used to class level Exceptions means theire is same exception  are contains two method
// that method call in other class in that time that class will handle the Exception

class Add {

    public void show() throws ClassNotFoundException {
        Class.forName("Cal");
    }
}

public class ExampleOfThrows {
    public static void main(String[] args) throws ClassNotFoundException {
        Add add= new Add();
        add.show();
    }
}

