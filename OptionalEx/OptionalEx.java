package OptionalEx;

import java.util.Optional;

public class OptionalEx {

    private static void printValue() {
        String str = null;
        String str2 = "Hello";
        String str3 = "World";

        // Using Optional to handle null values
        java.util.Optional<String> optionalStr = java.util.Optional.ofNullable(str);
        java.util.Optional<String> optionalStr2 = java.util.Optional.ofNullable(str2);
        java.util.Optional<String> optionalStr3 = java.util.Optional.ofNullable(str3);

        // Check if the value is present and print it
        optionalStr.ifPresentOrElse(
                value -> System.out.println("Value is: " + value),
                () -> System.out.println("Value is not present")
        );

        optionalStr2.ifPresentOrElse(
                value -> System.out.println("Value is: " + value),
                () -> System.out.println("Value is not present")
        );

        optionalStr3.ifPresentOrElse(
                value -> System.out.println("Value is: " + value),
                () -> System.out.println("Value is not present")
        );
    }

    private Optional<String> getOptionalValue(String str) {
        return Optional.ofNullable(str);
    }
    public static void main(String[] args) {

//        printValue();

        OptionalEx optionalEx = new OptionalEx();
        Optional<String> optionalValue = optionalEx.getOptionalValue(null);

        // Check if the value is present and print it
        optionalValue.ifPresentOrElse(
                value -> System.out.println("Value is: " + value),
                () -> System.out.println("Value is not present")
        );
    }
}
