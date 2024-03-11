package partices;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFirstNonRepeatCharGivenString {
    public static void main(String[] args) {
        String str = "indiaismycountry";

        String chart = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();

        System.out.println(" chart" + chart);
    }
}
