package n_June_24th_Tasks;

import java.util.Scanner;

public class Prime_number_ForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Any number to check prime: ");
        int num = scanner.nextInt();
    int count = 0;

    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            count++;
        }
    }

    if (count == 2) {
        System.out.println(num + " is a Prime Number.");
    } else {
        System.out.println(num + " is NOT a Prime Number.");
    }

    scanner.close();
}
    }
//Enter Any number to check prime:
//3
//3 is a Prime Number.
//
//Process finished with exit code 0