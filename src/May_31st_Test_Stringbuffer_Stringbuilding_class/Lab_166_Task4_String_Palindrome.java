package May_31st_Test_Stringbuffer_Stringbuilding_class;

public class Lab_166_Task4_String_Palindrome {
    public static void main(String[] args) {
        String str = "MaDAM";
        str= str.toLowerCase();// You can change this string
        boolean isPalindrome = true;

        int length = str.length();

        // Compare characters from both ends using for loop
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;  // No need to check further
            }
        }


          if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}