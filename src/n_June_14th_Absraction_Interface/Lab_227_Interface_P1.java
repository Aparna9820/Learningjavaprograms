package n_June_14th_Absraction_Interface;

public class Lab_227_Interface_P1 {
    public static void main(String[] args) {
        Car C= new Car();
        C.drive();
    }
}
class Car implements Breaks, Engine1{
    void drive(){
        apply_break();
        Start_Engine();
        Stop_Engine();
        Change_Gear();
        test_Engine();
    }

    @Override
    public void apply_break() {
        System.out.println("please Apply break");
    }

    @Override
    public void Start_Engine() {
        System.out.println("Start Engine");
    }

    @Override
    public void Stop_Engine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void Change_Gear() {
        System.out.println("Change Gear");
    }

    @Override
    public void test_Engine() {
        Engine1.super.test_Engine();      //Default function directly call from parent
    }
}
interface Breaks{
    void apply_break();
}
interface Engine1{
    void Start_Engine();
    void Stop_Engine();
    void Change_Gear();
    default void test_Engine(){
        System.out.println("Test the Engine");
    }
}

//please Apply break
//Start Engine
//Stop Engine
//Change Gear
//Test the Engine
//
//Process finished with exit code 0