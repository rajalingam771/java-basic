package map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 1. Add 5 students
        students.put(101, "Raj");
        students.put(102, "Arun");
        students.put(103, "Priya");
        students.put(104, "Kumar");
        students.put(105, "John");

        // 2. Display all students
        System.out.println("Students: " + students);

        // 3. Find student using ID
        System.out.println("Student 103: " + students.get(103));

        // 4. Change student's name
        students.put(102, "Arun Kumar");

        System.out.println("After changing ID 102: " + students);

        // 5. Remove one student
        students.remove(105);

        System.out.println("After removing ID 105: " + students);

        // 6. Check whether ID exists
        if (students.containsKey(103)) {
            System.out.println("Student ID 103 exists");
        } else {
            System.out.println("Student ID 103 does not exist");
        }

        // 7. Final map
        System.out.println("Final Map: " + students);
    }
}