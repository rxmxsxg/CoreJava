import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RepeatableNumbersFromAlphaNumeric {
    public static void main(String[] args){
        String alnu = "erna3322#kkr";
        Map<String,Long> ll = Arrays.stream(alnu.split("")).filter(a-> a.matches("\\d+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ll);
    }
}
