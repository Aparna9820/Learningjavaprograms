package t_july_5th_coding_tasks;
//Custom Exception Example
//Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.
// Define the custom exception by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class with a method to check age
 class AgeValidator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);  // This will throw the exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            validateAge(20);  // This will pass
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
//Caught exception: Age must be at least 18. Provided age: 16
//Age is valid: 20
//
//Process finished with exit code 0