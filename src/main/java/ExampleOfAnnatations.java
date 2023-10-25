import jdk.nashorn.internal.ir.Symbol;

// Annatation are give some other support to reduce the logical error in code
// for example @Override
class AnParent{
    public void showToTheParent(){
        System.out.println("In A");
    }
}
class AnChild extends AnParent{
   /* @Override
    public void showToThesParent(){
        System.out.println("In B");
    }*/
    @Override
    public void showToTheParent(){
        System.out.println("In B");
    }
}

public class ExampleOfAnnatations {
    public static void main(String[] args) {
        AnChild ch= new AnChild();
        //ch.showToThesParent();//except the Output in A but it show the InB
        // because you are not override the method. we avoid like this we need to give some extract check like this
    ch.showToTheParent();//now out put is In A

    }
}
