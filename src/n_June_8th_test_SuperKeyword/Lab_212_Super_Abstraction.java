package n_June_8th_test_SuperKeyword;

public class Lab_212_Super_Abstraction {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
        Vehicle v1= new Vehicle(90);
    }
}


class Vehicle{
    public int maxSpeed = 180;

    void noTest() {
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a ){
        System.out.println("Param Con");
    }
    Vehicle(int a, int b ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }



}

class Car extends Vehicle{
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    void test(){}

    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("Override of Car!");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();


    }

}
//Default Const
//PC Car
//Override of Car!
//180
//281
//Empty!

//Process finished with exit code 0