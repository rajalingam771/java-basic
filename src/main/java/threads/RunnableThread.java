package threads;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Processing Task");
    }
}

public class RunnableThread {

    public static void main(String[] args) {

        Task task = new Task();

        Thread t = new Thread(task);

        t.start();
    }
}