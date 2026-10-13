package Abstract;

abstract class Vehicle{
  abstract void start();
}
class Car extends Vehicle {

    // Providing implementation for start()
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}
public class Main {
    public static void main(String[] args) {

        // Create Car object
        Car car = new Car();

        // Call start()
        car.start();
    }
}
