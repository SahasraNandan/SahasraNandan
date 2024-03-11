package partices;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HowToRemoveTheDuplicationOfString {

    public static void main(String[] args) {
      List<String> str= Arrays.asList("java", "nandan", "java", "sahasra", "nandan");


      List<String> removeStr=str.stream().distinct().collect(Collectors.toList());


        System.out.println(" removeStr"+removeStr);


    }
}