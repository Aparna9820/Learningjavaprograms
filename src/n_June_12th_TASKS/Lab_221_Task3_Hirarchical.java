package n_June_12th_TASKS;
// Hierarchical Inheritance Program
// Description: Create a base class Vehicle. Derive classes Car and Bike from it.

public class Lab_221_Task3_Hirarchical {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.vehicle_func();
        c1.Car_func();
        System.out.println();

        Bike b1=new Bike();
        b1.vehicle_func();
        b1.Bike_func();
        System.out.println();

        Vehicle v1= new Bike();
        v1.vehicle_func();
        System.out.println();

        Vehicle v2= new Car();
        v2.vehicle_func();
        System.out.println();

        Vehicle v3= new Vehicle();
        v3.vehicle_func();
    }
}
class Vehicle{
    void vehicle_func(){
        System.out.println("Class for Vehicle");
    }
}

class Car extends Vehicle{
    void Car_func(){
        System.out.println("Class for Car");
    }
}

class Bike extends Vehicle{
    void Bike_func(){
        System.out.println("Class for Bike");
    }
}
//Class for Vehicle
//Class for Car
//
//Class for Vehicle
//Class for Bike
//
//Class for Vehicle
//
//Class for Vehicle
//
//Class for Vehicle
//
//Process finished with exit code 0