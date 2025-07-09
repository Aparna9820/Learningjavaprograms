package t_July_9th_tasks_Inheritance;

//task 1: "Animal Sound Simulator"
//📄 Description:  (Single Inheritance + Method Call)
// Create a base class Animal with a method makeSound().
// Then create a derived class Cat that has a method meow().
// In the main method, call both methods using the Cat object.

public class Animal_Sound_Simulato {
    public static void main(String[] args){
      Cat c1=new Cat();
      c1.makesound();
      c1.meow();
    }
}
class Animal{
    void makesound(){
        System.out.println("animal make sounds!");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("cat make sound as meow meow!");
    }
}

//animal make sounds!
//cat make sound as meow meow!

//Process finished with exit code 0