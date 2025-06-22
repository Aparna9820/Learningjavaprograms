package Codeing_Que_EXAM2_OOPS_Concepts;
//Outer and Inner Class Implementation
//Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.
public class Q13 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Access inner class from outer class method
        outer.showInner();

        // Access inner class directly from outside using Outer instance
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }

}
// Outer class
class Outer {
    int outerValue = 10;

    // Inner class
    class Inner {
        int innerValue = 20;

        void display() {
            // Accessing Outer class member from Inner class
            System.out.println("Outer value: " + outerValue);
            System.out.println("Inner value: " + innerValue);
        }
    }

    void showInner() {
        // Creating an instance of Inner class inside Outer class
        Inner inner = new Inner();
        inner.display();
    }
}
//Outer value: 10
//Inner value: 20
//Outer value: 10
//Inner value: 20
//
//Process finished with exit code 0