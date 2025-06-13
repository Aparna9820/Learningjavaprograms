package May_25th_TASKS;

public class Lab_145_task9_palindrome_number {
    public static void main(String[] args) {
        int num = 132;      // Number to check
        int original = num; // Store original number
        int reversed = 0;
        int n=0;

        while (num != 0) {
            n = num % 10;          // Get last digit
            reversed = reversed * 10 + n; // Build reversed number
            num /= 10;                    // Remove last digit
        }

        if (reversed == original) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }
    }
}
