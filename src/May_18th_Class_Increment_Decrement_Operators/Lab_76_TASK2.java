package May_18th_Class_Increment_Decrement_Operators;

public class Lab_76_TASK2 {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}
//a=13
//b=24
//c=103

//Process finished with exit code 0