package list.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // 1. Add 10 numbers in random order
        numbers.add(50);
        numbers.add(10);
        numbers.add(80);
        numbers.add(30);
        numbers.add(90);
        numbers.add(20);
        numbers.add(70);
        numbers.add(40);
        numbers.add(60);
        numbers.add(100);

        // 2. Add duplicate
        numbers.add(50);

        // 3. Display numbers
        System.out.println("Numbers: " + numbers);

        // 4. Check whether number exists
        if (numbers.contains(70)) {
            System.out.println("70 exists");
        } else {
            System.out.println("70 does not exist");
        }

        // 5. Remove one number
        numbers.remove(30);

        // 6. Final set
        System.out.println("Final set: " + numbers);
    }
}