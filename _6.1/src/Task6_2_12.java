import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task6_2_12 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(123,54325,456,567,768,7689,78,35,132);
        Comparator<? super Integer> comparator = (x, y) -> Integer.compare(x, y);
        BiConsumer<? super Integer, ? super Integer> biConsumer = (x1, x2) -> System.out.println("min: " + x1 + "\nmax: " + x2);
        findMinMax(stream, comparator, biConsumer);
    }

    public static  <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.collect(Collectors.toList());

        if (!list.isEmpty()) {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}
