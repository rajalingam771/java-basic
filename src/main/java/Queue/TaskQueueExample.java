package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueExample {

    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        // 1. Add tasks
        tasks.add("Login");
        tasks.add("Process Payment");
        tasks.add("Send Email");
        tasks.add("Generate Report");

        System.out.println("Tasks: " + tasks);

        // 2. See next task
        System.out.println("Next task: " + tasks.peek());

        // 3. Process tasks
        while (!tasks.isEmpty()) {

            String task = tasks.poll();

            System.out.println("Processing: " + task);
            System.out.println("Remaining: " + tasks);
        }

        // 4. Check whether queue is empty
        System.out.println("Queue empty: " + tasks.isEmpty());
    }
}