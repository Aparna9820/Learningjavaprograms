package May_17th_Type_Casting;

public class Lab_64_Typecasting_used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
//        int total1 = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit
        System.out.println(total);  //it return only int value as 118


        float total2 = course+GST; // Widening - auto - implicit
//        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2);   // it return total value in float as 118.45

    }
}
//118
//118.45
//
//Process finished with exit code 0

