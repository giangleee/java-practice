public class Car extends Vehicle  {
    String make;
    String model;
    int year;
    String color;
    double price;

    Car (String model) {
        this.model = model;
    }

    void drive () {
        System.out.println("You drive a car");
    }

    void brake() {
        System.out.println("You step on the brake");
    }

    @Override
    protected void call() {
        System.out.println("Car call");
    }
}
