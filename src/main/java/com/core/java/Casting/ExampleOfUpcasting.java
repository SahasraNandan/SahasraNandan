package com.core.java.Casting;

class Efg
{
    public void Show()
    {
        System.out.println("In A");
    }
}
class Ijk extends Efg
{
    public void Show1()
    {
        System.out.println("In B");
    }

}

public class ExampleOfUpcasting {
    public static void main(String[] args) {
       // Efg efg=new Efg();
       // Efg efg=new Ijk();
       // efg.Show();//In A
       // efg.Show1();//it will show the error bacause efg dont know the method of Ijk class
        Efg efg=(Efg) new Ijk();
        efg.Show();//In A
    }
}
