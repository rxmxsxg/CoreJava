import java.util.List;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class DataTypes {
    // Primitive data types
    int x = 10;
    char a = 'a';
    double d = 10.5;
    float f = 10.5f;
    long l = 1000000000L;
    boolean b = true;
    byte by = 10;
    short s = 100;
    // Wrapper classes
    Integer i = 1000;
    Long lo = 10000000000L;
    Float fl = 10.5f;
    Double db = 10.5;
    Character c = 'c';
    Short sh = 100;
    Boolean bo = true;
    Byte byt = 10;

    String str = "Hello, World!";
    // Arrays, 2D arrays, and Strings
    int[] arr = {1, 2, 3, 4, 5};
    String[] strArr = {"Hello", "World"};
    int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}};
    // 3 by 2 array
    int[][] threeByTwoArray = {{1, 2}, {3, 4}, {5, 6}};
    // 2 by 3 array
    int[][] twoByThreeArray = {{1, 2, 3}, {4, 5, 6}};
    // 3 by 3 array
    int[][] threeByThreeArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // collections
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    // 2D collections
    List<List<Integer>> twoDList = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
    // 3D collections
    List<List<List<Integer>>> threeDList = List.of(List.of(List.of(1, 2, 3), List.of(4, 5, 6)), List.of(List.of(7, 8, 9), List.of(10, 11, 12)));
    // arraylist
    List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    // linkedlist
    List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));
    // hashset
    Set<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 4, 5));
    // treeset
    Set<Integer> treeSet = new TreeSet<>(List.of(1, 2, 3, 4, 5));
    // hashmap
    Map<Integer, String> hashMap = new HashMap<>();
    // hashmap with initial values
    Map<Integer, String> hashMapWithValues = new HashMap<>() {{
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
    }};
    // hashmap with initial values using Map.of
    Map<Integer, String> hashMapWithValues2 = Map.of(1, "One", 2, "Two", 3, "Three");
    // concurrenthashmap
    Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
    // treemap
    Map<Integer, String> treeMap = new TreeMap<>();
    // linkedhashmap
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
}
