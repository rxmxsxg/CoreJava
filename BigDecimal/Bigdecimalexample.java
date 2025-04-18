package BigDecimal;
import java.math.BigDecimal;
public class Bigdecimalexample {
    public static void main(String[] args)
    {
        System.out.println("2.0-1.7 = 0.30000000000000004");
        float a1 = 2.0f;
        float a2 = 1.7f;
        float a3 = a1-a2;
        System.out.println(a3);
        double a = 2.0 - 1.7;
        System.out.println(a);
        var b = new BigDecimal("2.0");
        var c = new BigDecimal("1.7");
        System.out.println(b.subtract(c));
    }
}
