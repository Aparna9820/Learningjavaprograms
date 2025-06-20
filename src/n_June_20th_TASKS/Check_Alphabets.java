package n_June_20th_TASKS;
//Check if a Character is an Alphabet.
import java.util.Scanner;

public class Check_Alphabets {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Any Character");
        char ch=scanner.next().charAt(0);
         if((ch >='a' && ch <='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch + " is Alphabet");
        }else
             System.out.println(ch + " is not Alphabet, please enter valid Char");
    }
}
//Enter Any Character
//k
//k is Alphabet
//
//Process finished with exit code 0