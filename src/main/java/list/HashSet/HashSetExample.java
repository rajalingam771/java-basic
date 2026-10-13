package list.HashSet;


import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        // 1. Add 5 student names
        students.add("Raj");
        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");
        students.add("John");

        // 2. Add duplicate
        students.add("Raj");

        // 3. Display all students
        System.out.println("Students: " + students);

        // 4. Check whether student exists
        if (students.contains("Priya")) {
            System.out.println("Priya exists");
        } else {
            System.out.println("Priya does not exist");
        }

        // 5. Remove student
        students.remove("John");

        // 6. Final set
        System.out.println("Final set: " + students);
    }
}