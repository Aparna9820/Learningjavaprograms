package n_June_7th_OOPs_Cocept;

public class Lab_195_Baby_class_with_main_class {
    public static void main(String[] args) {
        Baby b1 = new Baby(); //1st
        new Baby();           //2nd
        new Baby();           //3rd
        Baby b2;     //it just reference only, it didn't print anything

    }

}

class Baby{
    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }
}
//I am called, Object is created!
//I am called, Object is created!
//I am called, Object is created!

//Process finished with exit code 0
