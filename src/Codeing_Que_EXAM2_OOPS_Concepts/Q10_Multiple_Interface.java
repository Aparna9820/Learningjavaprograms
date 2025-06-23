package Codeing_Que_EXAM2_OOPS_Concepts;
//Multiple Interface Implementation
//Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.
public class Q10_Multiple_Interface {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();   // Output: Duck is flying.
        duck.swim();  // Output: Duck is swimming
    }
}
// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Duck class implementing both interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

//Duck is flying.
//Duck is swimming.

//Process finished with exit code 0