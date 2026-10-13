package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServicewithCallable {
    public static void main(String[] args) throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {

            int a = 10;
            int b = 20;

            return a + b;
        };

        Future<Integer> future = executor.submit(task);

        int result = future.get();

        System.out.println("10 + 20 = " + result);

        executor.shutdown();
    }
}
