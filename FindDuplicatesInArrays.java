import java.util.*;


public class FindDuplicatesInArrays {
    public void findCommonElements(List<Integer> arr1, Integer[] arr2) {
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> common = new HashSet<>();
        for (Integer num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        System.out.println("Common elements: " + common);
    }

    // HashSet - insertion order is not preserved,
    public static void main(String[] args) {
        Integer[] arr1 = {4, 1, 5, 2, 4, 3, 3};
        Integer[] arr2 = {3, 4, 5, 6, 7};
        var al = new ArrayList<Integer>();
//        System.out.println(List.of(arr));
//        var f = new FindDuplicatesInArrays();
//        f.findCommonElements(Arrays.asList(arr1), arr2);
//        var s = new HashSet<>(Arrays.asList(arr1));
//        System.out.println(s);
    }
}
