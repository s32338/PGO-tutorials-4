import java.math.BigDecimal;

public class Multiplier {
    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int multiply(int a, int b, int c, int d) {
        return multiply(multiply(a,b), multiply(c,d));
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static Integer multiply(Integer a, Integer b) {
        return a*b;
    }
}
