package n_June_28th_tasks;
//String Comparison and Equality
//Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
public class task2 {
    public static void main(String[] args) {
        // String literals (same value, interned)
        String str1 = "Hello";
        String str2 = "Hello";

        // String object created with 'new' keyword (not interned by default)
        String str3 = new String("Hello");
        String str4 = "hello"; // lowercase 'h'

        // == operator (reference comparison)
        System.out.println("str1 == str2: " + (str1 == str2));       // true
        System.out.println("str1 == str3: " + (str1 == str3));       // false

        // equals() method (content comparison, case-sensitive)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // equalsIgnoreCase() (content comparison, case-insensitive)
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        // compareTo() (lexicographical comparison, case-sensitive)
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative value
        System.out.println("str4.compareTo(str1): " + str4.compareTo(str1)); // positive value
    }
}
//str1 == str2: true
//str1 == str3: false
//str1.equals(str2): true
//str1.equals(str4): false
//str1.equalsIgnoreCase(str4): true
//str1.compareTo(str2): 0
//str1.compareTo(str4): -32
//str4.compareTo(str1): 32
//
//Process finished with exit code 0