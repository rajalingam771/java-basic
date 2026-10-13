package LambdaExpression;

import java.util.function.BiFunction;

public class LambdaExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiply =
                (a, b) -> a * b;

        int result = multiply.apply(10, 5);

        System.out.println("Multiplication: " + result);
    }

}
