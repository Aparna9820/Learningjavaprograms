package Codeing_Que_EXAM2_OOPS_Concepts;
//Drawable Interface Implementation
//Create an interface "Drawable" with a method "draw()". Implement this interface in classes "Circle" and "Rectangle".
public class Q9 {
    public static void main(String[] args) {
        Drawable d1 = new MyCircle();
        Drawable d2 = new MyRectangle();

        d1.draw();  // Output: Drawing a Circle
        d2.draw();  // Output: Drawing a Rectangle
    }
}
// Interface declaration
interface Drawable {
    void draw();  // Abstract method
}

// Implementing class: Circle
class MyCircle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Implementing class: Rectangle
class MyRectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

//Drawing a Circle
//Drawing a Rectangle
//
//Process finished with exit code 0