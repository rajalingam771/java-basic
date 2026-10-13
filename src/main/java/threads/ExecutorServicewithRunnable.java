package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicewithRunnable {
    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            System.out.println("Processing Order");
        };

        for (int i = 1; i <= 5; i++) {
            executor.execute(task);
        }

        executor.shutdown();
    }
}
