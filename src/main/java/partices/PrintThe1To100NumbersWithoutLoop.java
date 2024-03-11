package partices;

public class PrintThe1To100NumbersWithoutLoop {




    public static void main(String[] args) {


        String str=1+2+"ONE"+1+2+"TWO";
        System.out.println(str);
        printNumber(1);
    }


    public static void printNumber(int n){

        if(n<=100){
            System.out.println(n);
            printNumber(n+1);
        }

    }
}
