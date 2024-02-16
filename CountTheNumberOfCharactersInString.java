import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNumberOfCharactersInString {
    public static void main(String[] args){
        String str = "aaabbaacdddaaeefg";
        StringBuilder sb = new StringBuilder();
        List<String> s = Arrays.stream(str.split("")).sorted().toList();
        System.out.println(s);
        /*
        the output will be charactore and its repetition count
         */
         Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)->sb.append(k).append(v));
        System.out.println(sb);
        /*
         to get only keys/values from map
         */
        List<String> keys = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .keySet().stream().toList();
        System.out.println(keys);
        List<Long> values = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().toList();
        System.out.println(values);
        /*
        to get unique values
         */
        List<String> uniqueValues = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(uniqueValues);
    }




}
