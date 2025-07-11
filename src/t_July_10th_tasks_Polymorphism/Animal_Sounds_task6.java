package t_July_10th_tasks_Polymorphism;
// Task 1: Animal Sounds
//Title: Override sound behavior in subclasses
//Description:
//Create a base class Animal with a method sound().
//Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
//Create an object of each class and call sound() to
// see how overriding provides different outputs using the same method name.

public class Animal_Sounds_task6 {
    public static void main(String[] args){
       Animal A=new Animal();
       A.sound();

        Dog D=new Dog();
        D.sound();


        Cat C=new Cat();
        C.sound();


        Cow C1=new Cow();
        C1.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animals Make Sounds");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog make sound as Bark");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat make sound as Meow");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow make sound as Moo");
    }
}
//Animals Make Sounds
//Dog make sound as Bark
//Cat make sound as Meow
//Cow make sound as Moo
//
//Process finished with exit code 0