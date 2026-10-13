package threads;


class Taskes{

    private volatile boolean isRunning = true;

    public void runTask() {

        while (isRunning) {
            System.out.println("Thread 1 is running...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread 1 stopped");
    }

    public void stopTask() {
        isRunning = false;
    }
}

public class volatileThread {

    public static void main(String[] args) {

        Taskes task = new Taskes();

        Thread t1 = new Thread(() -> {
            task.runTask();
        });

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            task.stopTask();

            System.out.println("Thread 2 changed isRunning to false");
        });

        t1.start();
        t2.start();
    }
}


//volatile provides visibility, but it does not make compound operations atomic.
//Topic	Key Point
//Thread	Create thread by extending Thread
//Runnable	Define task separately from thread
//start()	Creates/starts a new thread
//run()	Normal method call; doesn't create a thread
//Multiple threads	Execution order is not guaranteed
//Daemon	Background thread; JVM doesn't wait for it
//synchronized	Protects shared resource / critical section
//Race condition	Multiple threads access shared data unsafely
//volatile	Provides visibility of changes between threads
//volatile ≠ synchronized	Volatile doesn't provide general mutual exclusion