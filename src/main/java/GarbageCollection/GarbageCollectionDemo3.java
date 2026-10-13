package GarbageCollection;

public class GarbageCollectionDemo3 {
    public static void main(String[] args) {

        String name = new String("Java");

        // Remove reference
        name = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("GC requested");
    }
}
