package n_June_9th_tasks_COSTRUCTOR_Classes;


//Define a Car class with brand, model, and price. Initialize using constructor and print car details.

public class Lab_215_Task2_Car {
    public static void main(String[] args) {
        Lab_215_Task2_Car c1= new Lab_215_Task2_Car("taxa", "tata", 7890.987);
        c1.dispplay();
    }

    private String model;
    private String brand;
    private double price;

    Lab_215_Task2_Car(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;

    }
    void dispplay(){
        System.out.println("car brand " +brand);
        System.out.println("car model " +model);
        System.out.println("car price " +price);

    }


}
//car brand tata
//car model taxa
//car price 7890.987