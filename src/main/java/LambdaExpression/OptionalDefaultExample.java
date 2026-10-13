package LambdaExpression;

import java.util.Optional;

public class OptionalDefaultExample {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        String result = name.orElse("Unknown");

        System.out.println(result);
    }
}
