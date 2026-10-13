package LambdaExpression;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> language =
                Optional.of("Java");

        language.ifPresent(value ->
                System.out.println(value));
    }
}
