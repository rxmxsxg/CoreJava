import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceBetweenMapAndFlatMap {
    public static void main(String[] args){
        /*
        map
         */
        List<String> words = Arrays.asList("ramesh","gongura");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseWords);
        /*
        flatMap
         */
         List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("ramesh","gongura"),
                Arrays.asList("tanshu","gongura"),
                Arrays.asList("tharunika","gongura"),
                Arrays.asList("sw","gongura")
        );
         List<String> flatLists = listOfLists.stream().flatMap(List::stream).toList();
        System.out.println(flatLists);
    }
}

