package n_June_12th_TASKS;

public class Lab_219_Task1_SI_Animal {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal make Different sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Make sound as BOW BOW");
    }
}
//Dog Make sound as BOW BOW
//
//Process finished with exit code 0

