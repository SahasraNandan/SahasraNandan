class A
{
    public void show(){
        System.out.println("show1");
    }
    class B
    {
        public void show1(){
            System.out.println("show2");
        }
    }
    static class C
    {
        public void show1(){
            System.out.println("show3");
        }
    }
}
// inside the class we can create other class that is inner class.once call the inner class method
// we need to create parent class object otherwise we need create static inner class
public class ExampleOfInnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
        A.B obj1=  obj.new B();
        obj1.show1();
        A.C obj2=  new A.C();
        obj2.show1();

    }
}
