package n_June_17th_Tasks_If_else;

//Check if a Person is Eligible to Vote (Age Check).

import java.util.Scanner;

//public class Task5 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println(" Enter the Age: ");
//        int age= scanner.nextInt();
//        if(age>=18){
//            System.out.println("Eligible for Vote");
//        }else
//            System.out.println("Not Eligible for Vote");
//
//        scanner.close();
//    }

//}
// Edge case program

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Age: ");
        try {
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else if (age >= 0) {
                System.out.println("Not eligible to vote");
            } else {
                System.out.println("Age cannot be negative");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        scanner.close();
    }
}
