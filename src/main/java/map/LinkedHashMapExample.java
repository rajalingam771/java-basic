package map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> employees =
                new LinkedHashMap<>();

        // 1. Add 5 employees
        employees.put(101, "Raj");
        employees.put(102, "Arun");
        employees.put(103, "Priya");
        employees.put(104, "Kumar");
        employees.put(105, "John");

        // 2. Display employees
        System.out.println("Employees: " + employees);

        // 3. Existing ID with different name
        employees.put(103, "Priya Sharma");

        System.out.println("After changing ID 103: " + employees);

        // 4. Remove one employee
        employees.remove(104);

        // 5. Add new employee
        employees.put(106, "Vijay");

        // 6. Final map
        System.out.println("Final Map: " + employees);
    }
}