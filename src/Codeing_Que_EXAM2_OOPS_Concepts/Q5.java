package Codeing_Que_EXAM2_OOPS_Concepts;
//Animal Sound Polymorphism
//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
public class Q5 {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
        System.out.println();

        CAT c1= new CAT();
        c1.sound();
        System.out.println();

        Animal A1= new Animal();
        A1.sound();
        System.out.println();

        Animal A2= new CAT();
        A2.sound();
        System.out.println();

        Animal A3= new Dog();
        A3.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Make Sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("BOW BOW");
    }
}
class CAT extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Sounds");
    }
}

//BOW BOW
//
//Cat Sounds
//
//Animal Make Sound
//
//Cat Sounds
//
//BOW BOW
//
//Process finished with exit code 0