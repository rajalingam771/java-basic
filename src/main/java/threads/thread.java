package threads;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Task is running");
    }
}
public class thread {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }
}
