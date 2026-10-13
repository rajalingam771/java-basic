package list.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> employees = new LinkedHashSet<>();

        // 1. Add 5 employees
        employees.add("Raj");
        employees.add("Arun");
        employees.add("Priya");
        employees.add("Kumar");
        employees.add("John");

        // 2. Add duplicate
        employees.add("Raj");

        System.out.println("Employees: " + employees);

        // 3. Remove one employee
        employees.remove("Kumar");

        System.out.println("After removing Kumar: " + employees);

        // 4. Add new employee
        employees.add("Vijay");

        // 5. Final set
        System.out.println("Final set: " + employees);
    }
}