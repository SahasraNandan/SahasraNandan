package partices;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingJava8CountingtheStringvalues {

    public static void main(String[] args) {
        String str="india is mycountry";
        long count = Stream.of(str.split(""))
                .flatMapToInt(CharSequence::chars)
                .filter(ch -> ch == 'i' || ch == 'I') // consider both lowercase and uppercase 'i'
                .count();

       // type-2

        long count1 = str.chars()
                .filter(ch -> ch == 'i' || ch == 'I') // consider both lowercase and uppercase 'i'
                .count();


    }
}
