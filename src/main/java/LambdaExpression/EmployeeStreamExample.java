package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamExample {

    public static void main(String[] args) {

        List<String> employees =
                Arrays.asList(
                        "Sai",
                        "Rahul",
                        "John",
                        "Priya",
                        "Suresh"
                );

        employees.stream()
                .forEach(System.out::println);
    }
}
