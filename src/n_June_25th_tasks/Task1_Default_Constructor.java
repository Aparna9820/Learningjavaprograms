package n_June_25th_tasks;

public class Task1_Default_Constructor {
    public static void main(String[] args) {
        Car C=new Car();
        C.display();
    }
}
class Car{
    String model;
    int year;

     Car() {
        model="XXX";
        year=2023;
    }
    void display(){
        System.out.println("model of the car "+model + " & "+ "year "+year);
    }
}
//model of the car XXX & year 2023
//
//Process finished with exit code 0