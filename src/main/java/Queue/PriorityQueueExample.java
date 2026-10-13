package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // 1. Add numbers
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        // 2. Check which number comes first
        System.out.println("First: " + numbers.peek());

        // 3. Remove one by one
        while (!numbers.isEmpty()) {

            System.out.println("Processing: " + numbers.poll());
        }

        // 4. Check whether queue is empty
        System.out.println("Queue empty: " + numbers.isEmpty());
    }
}