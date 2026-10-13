package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {

            int taskNumber = i;

            executor.submit(() -> {

                System.out.println(
                        "Processing Task " + taskNumber
                );

            });
        }

        executor.shutdown();
    }
}
