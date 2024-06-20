import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task6_2_15 {
    public static void main(String[] args) {
        System.out.println(factorial(19));
    }

    public static BigInteger factorial(int value) {
        if (value <= 0 || value == 1) {
            return BigInteger.ONE;
        } else {
            return IntStream.rangeClosed(2, value).mapToObj(BigInteger:: valueOf).reduce(BigInteger::multiply).get();
        }
    }
}
