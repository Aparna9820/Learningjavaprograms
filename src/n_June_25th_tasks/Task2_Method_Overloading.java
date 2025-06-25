package n_June_25th_tasks;

public class Task2_Method_Overloading {
    public static void main(String[] args) {
        Constructor C1=new Constructor();
        System.out.println(C1.add(2,3));
        System.out.println(C1.add(2.4,7.8));
        System.out.println(C1.add(4,8,9));

    }
}
class Constructor{
    // Method 1: add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

//5
//10.2
//21

//Process finished with exit code 0