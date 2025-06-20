package n_June_17th_Tasks_If_else;

//Check if a Character is a Vowel or Consonant.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // read first character and convert to lowercase

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        scanner.close();
    }
}
//Enter a single alphabet character: A
//a is a Vowel.

//Process finished with exit code 0

