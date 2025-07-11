package t_July_10th_tasks_Polymorphism;
// Task 5: Find Maximum
//Title: Find max using overloaded functions
//Description:
//Create a class Utility with two methods named max():
//max(int a, int b) returns the larger of two integers
//max(int a, int b, int c) returns the larger of three integers
//max(double a, double b) returns the larger of two decimal values
//Add method calls in main() to compare different types.

public class Find_Maximum_task5 {
    public int max(int a, int b){
        return ((a>b)?a:b);
    }

    public int max(int a, int b, int c){
        return Math.max((Math.max(a, b)), c);
    }
    public double max(double a, double b){
        return (a>b)?a:b;
    }

    public static void main(String [] args){
        Find_Maximum_task5 m= new Find_Maximum_task5();
        int r1= m.max(4,7);
        System.out.println("max of 2 int numbers: "+r1);

        int r2=m.max(45,67,78);
        System.out.println("max of 3 int numbers: "+r2);

        double r3=m.max(90.98,89.90);
        System.out.println("max of 2 double numbers: "+r3);
    }
}
//max of 2 int numbers: 7
//max of 3 int numbers: 78
//max of 2 double numbers: 90.98
//
//Process finished with exit code 0