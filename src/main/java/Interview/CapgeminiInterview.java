package Interview;

import java.util.Arrays;

public class CapgeminiInterview {

    public static void main(String[] args) {
        //how find out in natural number in array missing number

       // int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10};

        int[] arr = new int[]{9,6,5,1};
        int sum = (10 * 11) / 2;
        int acualsum = 0;

        for (int i = 0; i < arr.length; i++) {
            acualsum = acualsum + arr[i];

        }
        System.out.println("missing nutural number " + (sum - acualsum));

// need to pring 1st sentence in Capital and second is small
        String s = "String Cloud";

        int mid = s.length() / 2;

        String upper = "";
        String lower = "";
        for (int i = 0; i < s.length(); i++) {

            if (i < mid) {

                String upp = upper + s.charAt(i);
                upper = upp.toUpperCase();


            }
            String low = lower + s.charAt(i);
            lower = low.toLowerCase();
        }
        System.out.println("upper" + upper);
        System.out.println("lower" + lower);


        // print the given integer number count

        int num = 123456;
        // using in bulid function
        String str = Integer.toString(num);
        System.out.println("num count" + str.length());
        // using normal follow
        int cout = 0;
        while (num > 0) {
            cout++;
            num = num / 10;
        }
        System.out.println("num count" + cout);

// remove the gaven string in particalr letter

        String str1 = "javastriganodea";
        String romveChar = "";
        char c = 'a';
        for (int i = 0; i < str1.length(); i++) {

            if (c != str1.charAt(i)) {
                romveChar = romveChar + str1.charAt(i);
            }
        }
        System.out.println("romveChar" + romveChar);

        // given two arrays are same are not

        int[] num1 =  {1, 2, 3, 4};

        int[] num2 =  {3, 4, 2, 1};
         int n1=num1.length;
        int n2=num2.length;
        boolean value= false;

        if (n1==n2){
            value=true;
        }

        Arrays.sort(num2);
        Arrays.sort(num1);

        for(int i=0;i<n1;i++)
        {
            if(num1[i]==num2[i])
            {
                value=true;
            }
        }
        if(value){
            System.out.println("both are same");
        }

        // given integer array put even number 1st after odd number

        int[] arry={1,4,5,8,2,3,10};
        int[]a=new int[arry.length];
        int index=0;
        //even number
        for(int i=0;i<arry.length;i++) {

            if (arry[i] / 2 == 0) {
                a[index] = arry[i];
                index++;
            }
        } //odd number
            for(int i=0;i<arry.length;i++){

                if(arry[i]/2!=0)
                {
                    a[index] =arry[i];
                    index++;
                }
        }
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}