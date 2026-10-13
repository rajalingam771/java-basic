package threads;

class MyThreades extends Thread {

    public void run() {
        System.out.println("Running");
    }
}
public class threadrun {
    public static void main(String[] args) {

        MyThreades t = new MyThreades();

        t.run();
        System.out.println("Main");
    }
}
//start() creates a new thread and causes the JVM to execute the run() method on that new thread.
// Calling run() directly does not create a new thread; it behaves like a normal method call.
