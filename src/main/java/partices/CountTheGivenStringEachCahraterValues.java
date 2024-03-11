package partices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheGivenStringEachCahraterValues {

    public static void main(String[] args) {


        String str="indiaismycountry";

        Map<String,Long> strList= Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(" strList"+strList);

    }
}
