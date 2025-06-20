package n_June_12th_TASKS;
// Use of super keyword Program
// Description: Use super to call parent class method.

public class Lab_224_Task6_Super_keyword {
    public static void main(String[] args) {
        DOG D= new DOG();
        D.sound();
    }
}
class ANIMAL {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class DOG extends ANIMAL {
    @Override
    void sound() {
        super.sound();  // Call the parent class method
        System.out.println("Dog barks");
    }
}

//Animal makes a sound
//Dog barks
//
//Process finished with exit code 0