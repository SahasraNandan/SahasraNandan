package com.core.java.string;

public class ExampleImmutableString {

    //String value can not be change .it can not create new object  using stringConstantpool it will refere the value
    public static void main(String[] args) {


        String name="Nandan";

        name=name+"Sahasra";

        System.out.println(name.hashCode());
        //  System.out.println(name1.hashCode());
        System.out.println(name.hashCode());

    }
}
