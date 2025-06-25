package n_June_15th_Wrapper_Class;

public class Wrapper_P6 {
    public static void main(String[] args) {
        // Primitive to Integer (Boxing)
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt); // Explicit boxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing
        System.out.println("Primitive to Integer (Boxing): " + boxedInt + ", " + autoBoxedInt);

        // Integer to primitive (Unboxing)
        Integer integerObj = 100;
        int unboxedInt = integerObj.intValue(); // Explicit unboxing
        int autoUnboxedInt = integerObj; // Auto-unboxing
        System.out.println("Integer to primitive (Unboxing): " + unboxedInt + ", " + autoUnboxedInt);

        // String to Integer
        String str = "123";
        Integer parsedInt = Integer.parseInt(str);
        System.out.println("String to Integer: " + parsedInt);

        // Integer to String
        Integer intObj = 456;
        String intToStr = intObj.toString();
        String intToStr2 = String.valueOf(intObj);
        System.out.println("Integer to String: " + intToStr + ", " + intToStr2);

    }
}
//Primitive to Integer (Boxing): 42, 42
//Integer to primitive (Unboxing): 100, 100
//String to Integer: 123
//Integer to String: 456, 456
//
//Process finished with exit code 0