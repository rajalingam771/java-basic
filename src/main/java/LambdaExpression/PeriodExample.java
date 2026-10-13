package LambdaExpression;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        LocalDate startDate =
                LocalDate.of(2020, 1, 10);

        LocalDate endDate =
                LocalDate.of(2025, 6, 20);

        Period period =
                Period.between(startDate, endDate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
