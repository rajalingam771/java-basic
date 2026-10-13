package threads;
class Monitor extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("Monitoring...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Daemon {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();

        monitor.setDaemon(true);

        monitor.start();

        System.out.println("Main task completed");
    }
}
//A daemon thread is a background thread that does not prevent the JVM from shutting down.
//
//When all normal/user threads finish, the JVM can terminate even if daemon threads are still running.
