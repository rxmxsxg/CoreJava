import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsFromList {
    public static void method1(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
       Set<Integer> s = set.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println(s);
    }
    public static void method2(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set.retainAll(set2);
        System.out.println(set);
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8);

        method1(list1, list2);
        method2(list1, list2);
    }
}
