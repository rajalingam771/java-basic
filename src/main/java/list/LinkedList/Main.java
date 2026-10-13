package list.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        // 1. Add 5 numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("After adding 5 numbers: " + numbers);

        // 2. Add number at beginning
        numbers.addFirst(5);

        System.out.println("After adding at beginning: " + numbers);

        // 3. Add number at end
        numbers.addLast(60);

        System.out.println("After adding at end: " + numbers);

        // 4. Remove a number
        numbers.remove(Integer.valueOf(30));

        System.out.println("After removing 30: " + numbers);

        // 5. First element
        System.out.println("First element: " + numbers.getFirst());

        // 6. Last element
        System.out.println("Last element: " + numbers.getLast());

        // 7. Print all elements
        System.out.println("All elements:");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
