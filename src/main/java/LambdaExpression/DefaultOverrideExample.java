package LambdaExpression;

interface Vehicle1 {

    default void start() {
        System.out.println("Vehicle is starting");
    }
}

class Cars implements Vehicle1 {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

public class DefaultOverrideExample {

    public static void main(String[] args) {

        Cars car = new Cars();

        car.start();
    }
}
