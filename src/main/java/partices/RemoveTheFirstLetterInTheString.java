package partices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheFirstLetterInTheString {


    public static void main(String[] args) {


        String str="CLOUD";

        char c='C';
        String removeList1=str.replace("C","");
        System.out.println("listRemove List: " + removeList1);


        List<String> removeList=Arrays.stream(str.split(""))
                .skip(1).collect(Collectors.toList());
        System.out.println("listRemove List: " + removeList);


        int n=str.length();
        String removeString="";
        for(int i=0;i<n;i++){
           if(str.charAt(i)!=c){
               removeString=removeString+str.charAt(i);
           }

        }
        System.out.println("removeString " + removeString);
    }
}
