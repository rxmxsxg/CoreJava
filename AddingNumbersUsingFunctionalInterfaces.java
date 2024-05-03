import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

interface Adder {
    int add(int a, int b);
}

public class AddingNumbersUsingFunctionalInterfaces {
    public static void main(String[] args) {
	Adder adder = (a, b) -> a + b;
	int result = adder.add(2, 3);
	System.out.println(result);
    }
}
