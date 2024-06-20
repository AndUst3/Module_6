import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6_2_14 {
    public static void main(String[] args) {

        new Scanner(System.in).tokens().flatMap(string -> Stream.of(string.split("[\\p{Punct}\\s]+")).
                map(String::toLowerCase)).
                collect(Collectors.toMap(String::toLowerCase, string -> 1, Integer::sum)).entrySet().stream()
                .sorted((o1, o2) -> Objects.equals(o1.getValue(), o2.getValue()) ? o1.getKey().compareTo(o2.getKey()):
                        o2.getValue().compareTo(o1.getValue())).
                limit(10).forEach(entry -> System.out.println(entry.getKey()));
    }
}
