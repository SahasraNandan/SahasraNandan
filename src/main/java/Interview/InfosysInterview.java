package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InfosysInterview {
// even number sum
    public static void main(String[] args) {


        //How to remove special chareter in String?
        //Example: string s="Nandan@#$"; output:Nandan@#$


        String s="Nandan@#$";
        String removedspecial="";
        for(int i=0;i<s.length();i++) {
            if (Character.isAlphabetic(s.charAt(i))){
                removedspecial=removedspecial+s.charAt(i);

            }


        }
        System.out.println("after remove special " + removedspecial);

        // check the string s2 is of s2 rotation
        // soloution i need append s1.s1 and then check rotaiton of string



        String s1="ABCD";

        String s2="CDAB";
         if(s1.length()==s2.length()&&((s1+s2).indexOf(s2)!=-1)){
             System.out.println("string s2 is of s2 rotation");
         }

                int[] numbers={1,2,3,4,6,7,8};
 int num=Arrays.stream(numbers).filter(x->x%2==0).sum();
        System.out.println("even number sum: " + num);

// dispaly the list of string are more repeted
        String[] names={"abc","abc","dgh","dgh","abc","gki"};

        long name=Arrays.stream(names).filter(x->x.equals("abc")).count();

        System.out.println("string are more repeted " + name);


        List<Integer> list=Arrays.asList(2,5,6,7,8,0);
      int fist=  list.stream().sorted(Comparator.reverseOrder()).findFirst().get();

        System.out.println("string are more repeted " + fist);

    }
}