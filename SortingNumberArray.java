import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortingNumberArray {
    public static void main(String[] args) {
        int[] numArray = {2, 5, 6, 1, 2, 0, 9, 3};
        // using streams
        int[] asc = Arrays.stream(numArray).sorted().toArray();
        System.out.println(Arrays.toString(asc));
      int[] dsc = Arrays.stream(numArray)
              .boxed()
              .sorted(Comparator.reverseOrder())
              .mapToInt(Integer::intValue)
              .toArray();
        System.out.println(Arrays.toString(dsc));
        // using for loop
        for (int i = 0; i < numArray.length - 1; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] < numArray[j]) {
                    int temp = numArray[j];
                    numArray[j] = numArray[i];
                    numArray[i] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numArray));
    }}
