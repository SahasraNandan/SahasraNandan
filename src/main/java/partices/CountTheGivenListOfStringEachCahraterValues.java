package partices;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheGivenListOfStringEachCahraterValues {
    public static void main(String[] args) {

        String str = "india is my country my is IS INDIA";

        Map<String, Long> strList = Arrays.stream(str.split("\\s+"))

                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                        strList.forEach((word, count) -> System.out.println(word + " : " + count));


    }
}
