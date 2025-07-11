package t_July_10th_tasks_Polymorphism;
//Task 2: Vehicle Start
//Title: Demonstrate engine start behavior using overriding
//Description:
//Create a base class Vehicle with a method start().
//Create Bike and Car classes that override the start() method:
//Bike prints "Kick start the bike"
//Car prints "Turn the key to start the car"
//This shows how polymorphism works with method overriding

public class Vehicle_Start_task7 {
    public static void main(String[] args) {
        vehicle v=new vehicle();
        v.start();
        Bike b= new Bike();
        b.start();
        Car c=new Car();
        c.start();
    }
}
class vehicle{
    void start(){
        System.out.println("vehicle started");
    }
}

class Bike extends vehicle{
    @Override
    void start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends vehicle{
    @Override
    void start(){
        System.out.println("Turn the key to start the car");
    }
}

//vehicle started
//Kick start the bike
//Turn the key to start the car
//
//Process finished with exit code 0