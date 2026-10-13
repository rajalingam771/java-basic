package GarbageCollection;

class GarbageCollectionDemo {

    public static void main(String[] args) {

        String name = new String("Java");

        // Object is currently reachable
        System.out.println(name);

        // Remove the reference
        name = null;

        // Object "Java" is now eligible for GC
    }
}
