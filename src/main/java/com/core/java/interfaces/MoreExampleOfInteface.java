package com.core.java.interfaces;
//note:class-class:extends
// class-Interface:Implements
//Interface-Interface:extends
// which class impetemts the Interfce we need to create the object for the reference
//other we can not call that method
// and also we have implemts one or more interfaces
interface O{
    void show();

}
interface P{
    void conig();

}

interface Q extends O{
    void run();
}
class R implements P,Q{


    public void show() {
        System.out.println("O");
    }


    public void conig() {
        System.out.println("P");
    }
    public void run() {
        System.out.println("Q");
    }
}
public class MoreExampleOfInteface {
    public static void main(String[] args) {
        P p= new R();
        p.conig();
       // p.run();//not able to call run
        Q q=new R();
        q.run();
        q.show();
    }


}
