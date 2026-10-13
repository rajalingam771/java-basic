package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 35, 40, 50, 25);

        numbers.stream()
                .filter(n -> n > 30)
                .forEach(System.out::println);
    }
}
