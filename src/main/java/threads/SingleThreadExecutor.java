package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {

            int taskNumber = i;

            executor.submit(() -> {
                System.out.println("Task " + taskNumber);
            });
        }

        executor.shutdown();
    }
}
