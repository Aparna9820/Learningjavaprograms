package May_24th_Switch_statement;

import java.util.Scanner;

public class Lab_87_InterviewQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
//o/p--->'Enter the day num(1 to 7)
//4
//
//Process finished with exit code 0    nothing will print