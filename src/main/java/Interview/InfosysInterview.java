package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InfosysInterview {
// even number sum
    public static void main(String[] args) {


                int[] numbers={1,2,3,4,6,7,8};

 int num=Arrays.stream(numbers).filter(x->x%2==0).sum();
        System.out.println("even number sum: " + num);

// dispaly the list of string are more repeted
        String[] names={"abc","abc","dgh","dgh","abc","gki"};

        long name=Arrays.stream(names).filter(x->x.equals("abc")).count();

        System.out.println("string are more repeted " + name);

    }
}