class D {
    public void show() {
        System.out.println("show1");
    }

}
//if we can change the show method behaviour with out using inheritance
public class ExampleOfAnonymousInnerClass {
    public static void main(String[] args) {
        D d = new D() {
            public void show() {
                System.out.println("show2");// with out class name
            }
        };
        d.show();
    }
}
