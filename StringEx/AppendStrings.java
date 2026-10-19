package StringEx;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppendStrings {
    private Optional<String> appendStrings(String[] strings) {
        if (strings == null || strings.length == 0) { // Check for null or empty array
            return Optional.empty(); // Return an empty Optional if the array is null or empty
        }
        String finalString = Arrays.stream(strings) // Create a stream from the array
                .map(String::toLowerCase) // Convert each string to lowercase
                .collect(Collectors.joining("-")); // Join the strings with a hyphen as the delimiter
        return Optional.of(finalString); // Return the joined string wrapped in an Optional

    }

    private Optional<String> appendCountryWithNameUsingStreams(String[] countries, String[] person) {
        if (countries == null || countries.length == 0 || person == null || person.length == 0) {
            return Optional.empty();
        }
        // country-name, usa-john, canada-doe, mexico-smith
        String result = Arrays.stream(countries)
                .flatMap(country -> Arrays.stream(person)
                        .map(name -> country.toLowerCase() + "-" + name.toLowerCase()))
                .collect(Collectors.joining(", "));
        return Optional.of(result);
    }

    private Optional<String> appendFruitwithColors(String[] fruits, String[] colors) {
        if (fruits == null || fruits.length == 0 || colors == null || colors.length == 0) {
            return Optional.empty();
        }
        // fruit-color, apple-red, banana-yellow, grapes-green
        String result = Arrays.stream(fruits)
                .flatMap(fruit -> Arrays.stream(colors)
                        .map(color -> fruit.toLowerCase() + "-" + color.toLowerCase()))
                .collect(Collectors.joining(", "));
        return Optional.of(result);
    }

    private Optional<String> mapFruitsWithColors(String[] fruits, String[] colors) {
        if (fruits == null || fruits.length == 0 || colors == null || colors.length == 0) {
            return Optional.empty();
        }
        // fruit-color, apple-red, banana-yellow, grapes-green
        String result = Arrays.stream(fruits)
                .map(fruit -> fruit.toLowerCase() + "-" + colors[Arrays.asList(fruits).indexOf(fruit)].toLowerCase())
                .collect(Collectors.joining(", "));
        return Optional.of(result);
    }

    private Optional<String[]> mapFruitsWithColorsUsingStreams(String[] fruits, String[] colors) {
        if (fruits == null || fruits.length == 0 || colors == null || colors.length == 0) {
            return Optional.empty();
        }
        // fruit-color, [apple-red, banana-yellow, grapes-green]
           String[] result = Arrays.stream(fruits)
                    .map(fruit -> fruit.toLowerCase() + "-" + colors[Arrays.asList(fruits).indexOf(fruit)].toLowerCase())
                    .toArray(String[]::new);
        return Optional.of(result);
    }

    public static void main(String[] args) {
        AppendStrings appendStrings = new AppendStrings();
//        String[] strings = {"dev", "SG"};
//        Optional<String> result = appendStrings.appendStrings(strings);
//        result.ifPresent(System.out::println); // Output: hello-world-java

//        Optional<String> result1 = appendStrings.appendCountryWithNameUsingStreams(new String[]{"USA", "Canada", "Mexico"}, new String[]{"John", "Doe", "Smith"});
//        result1.ifPresent(System.out::println); // Output: usa-john, usa-doe, usa-smith, canada-john, canada-doe, canada-smith, mexico-john, mexico-doe, mexico-smith
        // mapping fruits with their colors
        String[] fruits = {"Apple", "Banana", "Grapes"};
        String[] colors = {"Red", "Yellow", "Green"};
        Optional<String[]> result2 = appendStrings.mapFruitsWithColorsUsingStreams(fruits, colors);
        System.out.println(Arrays.toString(result2.get()));; // Output: apple-red, banana-yellow, grapes-green
    }
}
