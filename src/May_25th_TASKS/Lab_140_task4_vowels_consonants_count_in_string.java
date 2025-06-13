package May_25th_TASKS;

import java.util.Scanner;

public class Lab_140_task4_vowels_consonants_count_in_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any String");
        String S = scanner.nextLine();
        S = S.toLowerCase();
        int vowelcount = 0, Constantcount = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Only count alphabetic letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount++;
                } else
                    Constantcount++;
            }

        }
        System.out.println("Total Vowels " + vowelcount);
        System.out.println("Total Constants " + Constantcount);
    }

}
//Enter any String
//APARNA STUDYING
//Total Vowels 5
//Total Constants 9
//
//Process finished with exit code 0
