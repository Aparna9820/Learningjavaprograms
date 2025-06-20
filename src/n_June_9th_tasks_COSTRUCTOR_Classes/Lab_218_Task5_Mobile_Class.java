package n_June_9th_tasks_COSTRUCTOR_Classes;

//Create a class Mobile
//Use constructor overloading:
//First constructor → takes only brand
//Second constructor → takes brand and price

public class Lab_218_Task5_Mobile_Class {
    public static void main(String[] args) {
        Lab_218_Task5_Mobile_Class m1= new Lab_218_Task5_Mobile_Class("Oppo");
        m1.display();   //brand of the mobile1: Oppo
                        //Price of the mobile: 0.0
        System.out.println();

        Lab_218_Task5_Mobile_Class m2= new Lab_218_Task5_Mobile_Class("Samsung", 6789.456);
        m2.display();
    }
    private String brand;
    private double price;

    Lab_218_Task5_Mobile_Class(String brand) {
        this.brand = brand;
    }
    Lab_218_Task5_Mobile_Class(String brand, double price){
        this.brand = brand;
        this.price= price;
    }
    void display(){
        System.out.println("brand of the mobile1: " +brand);
        System.out.println("Price of the mobile: " +price);
    }
}
//brand of the mobile1: Oppo
//Price of the mobile: 0.0
//
//brand of the mobile1: Samsung
//Price of the mobile: 6789.456
//
//Process finished with exit code 0