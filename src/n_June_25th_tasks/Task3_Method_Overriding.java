package n_June_25th_tasks;

public class Task3_Method_Overriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
//Dog barks
//
//Process finished with exit code 0