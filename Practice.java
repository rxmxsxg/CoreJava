import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void partitionNums(){
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> mp = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));

        System.out.println(mp.get(true));
    }
    public static void removeDuplicates(){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
          List<String> noDuplicates = listOfStrings.stream().distinct().toList();
        System.out.println(noDuplicates);
    }
    public static void freqOfChars(){
        String inputString = "Java Concept Of The Day";
             String mod = inputString.replace(" ","");
//        System.out.println(mod);
//        Map<String,Long> ll = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Character,Long> r2 = mod.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(r2);
    }
    public static void addPrefixSufix(){
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings);
        String a = listOfStrings.stream().collect(Collectors.joining(",", "[","]"));
        System.out.println(a);

    }
    public static void maxAndMin(){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 99,15, 24, 75, 31, 89);
        int maxNum = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int minNum = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        int sum = listOfIntegers.stream().reduce(Integer::sum).get();
        int sum1 = listOfIntegers.stream().mapToInt(i-> i).sum();
        //System.out.println(maxNum);
        //System.out.println(minNum);
        System.out.println(sum);
        System.out.println(sum1);
    }
    public static void mergeArrays(){
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
    public static void get3MaxMin(){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> max3Num =listOfIntegers.stream().sorted().limit(3).toList();
        List<Integer> min3Nums = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(min3Nums);
        System.out.println(max3Num);
    }
    public static void angram(){
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String s11 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String s22 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(s11.equals(s22)){
            System.out.println("anagram");
        }else {
            System.out.println("not");
        }
    }
    public static void sumOfDigits(){
        int i = 15623;
        int sumDigit = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumDigit);
    }
    public static void uniqueElements(){
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueEle = new HashSet<>();
        Set<Integer> res = listOfIntegers.stream().filter(i-> !uniqueEle.add(i)).collect(Collectors.toSet());

        System.out.println(res);
    }
    public static void reverseArray(){
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] revArray = IntStream.rangeClosed(1,array.length)
                .peek(System.out::println)
                .map(i-> array[array.length-i]).toArray();
        System.out.println(Arrays.toString(revArray));
    }
    public static void tenEvenNums(){
//        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
//        Employee l = new Employee(1,"ram",777,"hr");
//        Integer r = Optional.of(l).map(e->e.getSalary()*2).orElse(null);
//        System.out.println(r);

    }
    public static void compExam() {
        CompletableFuture.runAsync(()-> System.out.println("this is one thread"));
        CompletableFuture.runAsync(()-> System.out.println("this is two thread"));

    }
    public static void main(String ...args){

         compExam();

    }
}
