package t_July_9th_tasks_Inheritance;
//Task 2: "Vehicle Constructor Chain"
//📄 Description:
//Create a class Vehicle with a constructor that prints "Vehicle is ready".
//Create a class Bike that extends Vehicle and
// prints "Bike is ready" in its constructor.
//Create an object of Bike in the main method and observe constructor call order.
public class Vehicle_Constructor_Chain {
    public static void main(String[] args) {
        Bike B= new Bike();
    }
}
class Vehicle{
    //vehicle constructor
    Vehicle() {
        System.out.println("Vehicle is ready!");
    }
}
class Bike extends Vehicle{
    //Bike constructor

     Bike() {
         System.out.println("Bike is Ready!");
    }
}
//Vehicle is ready!
//Bike is Ready!
//
//Process finished with exit code 0