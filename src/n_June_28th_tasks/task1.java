package n_June_28th_tasks;
//String Manipulation Basics
//Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
public class task1 {
    public static void main(String[] args) {
        // 1. String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // 2. Length of String
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);

        // 3. Substring
        String sub = fullName.substring(0, 4); // "John"
        System.out.println("Substring (0-4): " + sub);

        // 4. Character Extraction
        char charAtIndex5 = fullName.charAt(5); // Should be 'D'
        System.out.println("Character at index 5: " + charAtIndex5);
    }

}
//Full Name: John Doe
//Length of Full Name: 8
//Substring (0-4): John
//Character at index 5: D
//
//Process finished with exit code 0