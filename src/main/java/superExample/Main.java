package superExample;

class Vehicle {

    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}


class Car extends Vehicle {

    String brand = "BMW";

    @Override
    void start() {

        System.out.println("Car brand: " + brand);

        System.out.println("Parent brand: " + super.brand);

        super.start();

        System.out.println("Car is starting");
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
    }
}
