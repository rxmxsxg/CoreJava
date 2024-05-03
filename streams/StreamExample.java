package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String... args) {
       // ctrl+alt+shift 0l
        /*
        what is stream?
        Ans:- stream is a wrapper on datasource, it won't update actual list object
        how many ways create a stream?
        1.create from list object
        2.create from arrays
        3.using stream.of()
        4.Stream builder
         */

        //list of values
        List<String> values = List.of("one", "two", "three");
        Stream<String> stream1 = values.stream();

        //Arrays of values
        String[] names = {"one", "two", "three"};
        Stream<String> stream2 = Arrays.stream(names);

        //stream methods
        Stream<String> stream3 = Stream.of("one", "two", "three");
        //generate()
        Stream<String> stream4 = Stream.generate(() -> "one");


        //builder(), builder design patern
        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> stream5 = stringBuilder.add("one").add("two").add("three").build();

        // Empty steam, empty()
        Stream<String> stream6 = Stream.empty();
        /*
        Stream Operations:
        1.Intermediate Operations
        2.Terminal Operations
        Stream Pipeline:
        Intermediate Operations:
        when we call a method belongs to intermediate Operations, it will always another
        Stream Object of the operations results.
        -> we can call many intermediate operations on same stream instance as chain of methods
        ->this is called as pipelines on same stream source.
        -> Intermediate Operations are executed only once when we invoke terminal operations
        -> input as stream and output also stream
        Terminal Operations:
        we can call only one terminal method on any stream instance
         */

    }
}
