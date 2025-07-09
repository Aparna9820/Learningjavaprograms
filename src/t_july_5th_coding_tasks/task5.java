package t_july_5th_coding_tasks;
//Autoboxing and Unboxing Example
//Demonstrate autoboxing and unboxing with Integer.

public class task5 {
    public static void main(String[] args) {
        // Autoboxing: primitive int to Integer object automatically
        int primitiveInt = 100;
        Integer boxedInt = primitiveInt;  // Autoboxing
        System.out.println("Autoboxing: Integer object = " + boxedInt);

        // Unboxing: Integer object to primitive int automatically
        Integer anotherBoxedInt = 200;
        int unboxedInt = anotherBoxedInt;  // Unboxing
        System.out.println("Unboxing: primitive int = " + unboxedInt);

        // Autoboxing in expressions
        Integer sum = boxedInt + anotherBoxedInt;  // Unboxing happens for addition, then autoboxing for assignment
        System.out.println("Sum (autoboxing + unboxing): " + sum);
    }
}
//Autoboxing: Integer object = 100
//Unboxing: primitive int = 200
//Sum (autoboxing + unboxing): 300
//
//Process finished with exit code 0