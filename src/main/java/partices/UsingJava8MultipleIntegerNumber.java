package partices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingJava8MultipleIntegerNumber {


    public static void main(String[] args) {


        int[] arry={1,2,3,4,5,6,7,8,9,10};
        int[] araylist= Arrays.stream(arry)
                .map(x->x*5).toArray();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> araylist2= numbers.stream()
                .map(x->x*5).collect(Collectors.toList());

        System.out.println(Arrays.toString(araylist));
        System.out.println(araylist2);
    }
}
