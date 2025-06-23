package Codeing_Que_EXAM2_OOPS_Concepts;
//Vehicle Inheritance Hierarchy
//Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
public class Q6_Hirarchy_Inheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        vehicle.start();  // Output: Vehicle is starting...
        car.start();      // Output: Car is starting with key ignition...
        bike.start();     // Output: Bike is starting with kick...
    }
}
// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition...");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick...");
    }
}

//Vehicle is starting...
//Car is starting with key ignition...
//Bike is starting with kick...
//
//Process finished with exit code 0