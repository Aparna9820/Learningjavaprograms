package n_June_14th_Absraction_Interface;

public class Lab_226_Interface {
    public static void main(String[] args) {

        wagnor w1=new wagnor();
        w1.Drive();
    }
}
class wagnor extends Engine implements Tyre, Gear{
    void Drive(){
        Start_Engine();
        stop_Engine();
        Changegear();
        Rubbertyre();
        Balckcolortyre();
        block();
    }

    @Override
    void Start_Engine() {        //Abstract fuction by default represents void only not in public
        System.out.println("Starting the wagnor: ");
    }

    @Override
    public void Changegear() {        //Interface Functions by default represent the PUBLIC
        System.out.println("Change the gear:");
    }

    @Override
    public void Rubbertyre() {
        System.out.println("Rubber tyre:");
    }

    @Override
    public void Balckcolortyre() {
        System.out.println("Block color tyre:");
    }

}
abstract class Engine{
    abstract void Start_Engine();

    void stop_Engine(){
        System.out.println("Stop Engine");
    }
}
interface Tyre{
    void Rubbertyre();
    void Balckcolortyre();

    default void block(){
        System.out.println("Default is complete function in interface");
    }
    static void block1(){
        System.out.println("Static also complete function in Interface");
    }
}
interface Gear{
    void Changegear();
}


//Starting the wagnor:
//Stop Engine
//Change the gear:
//Rubber tyre:
//Block color tyre:
//Default is complete function in interface
//
//Process finished with exit code 0