package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccentrueInterview {

    public static void main(String[] args) {

        // remove the first letter in the string- display Stringlist values
        String str = "CLOUD";
        String[] strl = str.split("");
        List<String> listRemove = Arrays.stream(strl).skip(1).collect(Collectors.toList());
        System.out.println("listRemove List: " + listRemove);
        // remove the first letter in the string- display String

        System.out.println("listRemove List: " + str.replaceFirst("C"," "));

   // normal corejava
        char Ch='C';
        System.out.println(removefirstLetter(str,Ch));

        // sort the array and dispay the short list normal code

        int[] num2={2,3,4,1};

        bubbleSort(num2);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(num2));
        // how to check two arrays of equal based on lenght and values

        int[] num1={1,2,3,4};
        int[] num3={2,3,4,1};
        if(equalarra(num1,num3)){
            System.out.println("two arrays equal");

        }
        else{
            System.out.println("two arrays not equal");
        }


    }

    public static String removefirstLetter(String str,char c){
        String finalString="";
        int n=str.length();

        for(int i=0;i<n;i++){
            if(str.charAt(i)!=c){

                finalString=finalString+str.charAt(i);

            }
        }

        return finalString;
    }

    public static boolean equalarra(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        if(n!=m){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n;i++){

            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    swapped = true;
                }
            }
        } while (swapped);
    }
}
