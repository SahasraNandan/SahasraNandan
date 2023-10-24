 abstract class E {
     abstract public void show();
     abstract public void coing();


}

public class ExampleOfAbstractAnonymousInnerClass {

    public static void main(String[] args) {
        E e = new E() {
            public void show() {
                System.out.println("show2");// with out class name
            }
            public void coing() {
                System.out.println("show");// with out class name
            }
        };
        e.show();
        e.coing();
    }
}
