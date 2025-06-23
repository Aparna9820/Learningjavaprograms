package Codeing_Que_EXAM2_OOPS_Concepts;
//Abstract Shape Implementation
//Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
public class Q8_Abstraction {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}

// Abstract base class
abstract class Shape {
    // Abstract method to be implemented by subclasses
    abstract double getArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

//Rectangle Area: 50.0
//Circle Area: 153.93804002589985
//
//Process finished with exit code 0