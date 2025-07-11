package t_July_10th_tasks_Polymorphism;
//Task 3: Multiply Numbers
//Title: Multiply using overloaded methods
//Description:
//Create a class MathOperations with two multiply() methods:
//One takes two integers and returns the product
//Another takes three integers and returns their product
//This helps students understand how Java distinguishes methods based on parameter count.
public class Multiply_Numbers_task3 {
    public static void main(String[] args) {
        Multiply_Numbers_task3_class m= new Multiply_Numbers_task3_class();
        int r1=m.multiply(5,7);
        System.out.println(r1);

        int r2=m.multiply(3,5,12);
        System.out.println(r2);
    }
}

//35
//180
//
//Process finished with exit code 0