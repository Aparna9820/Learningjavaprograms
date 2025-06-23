package Codeing_Que_EXAM2_OOPS_Concepts;
//Custom Exception Implementation
//Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.
public class Q15_Custom_Exception_Implementation {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();

        int[] testAges = {20, 15, 18};

        for (int age : testAges) {
            try {
                validator.validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}
// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to check age
class AgeValidator {
    void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18. Provided: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

//Age is valid: 20
//Caught Exception: Age must be at least 18. Provided: 15
//Age is valid: 18

//Process finished with exit code 0