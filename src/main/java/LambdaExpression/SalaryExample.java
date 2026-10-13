package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class SalaryExample {

    public static void main(String[] args) {

        List<Integer> salaries =
                Arrays.asList(30000, 55000, 60000, 45000, 75000);

        long count = salaries.stream()
                .filter(salary -> salary > 50000)
                .count();

        System.out.println("Employees: " + count);
    }
}
