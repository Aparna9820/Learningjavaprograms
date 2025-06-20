package n_June_9th_tasks_COSTRUCTOR_Classes;

//Write a Book class that takes title, author, and price via constructor. Display all values.

public class Lab_217_Task4_Book_Class {
    public static void main(String[] args) {
        Lab_217_Task4_Book_Class b1= new Lab_217_Task4_Book_Class("The Legend", "Sri Sri", 89.90);
        b1.display();
    }
    private String Title, Author;
    private double price;

    Lab_217_Task4_Book_Class(String Title, String Author, double price) {
        this.Title = Title;
        this.Author= Author;
        this.price= price;
    }
    void display(){
        System.out.println("Title of Book: "   +Title);
        System.out.println("Author of Book: "   +Author);
        System.out.println("price of Book: "   +price);
    }
}
//Title of Book: The Legend
//Author of Book: Sri Sri
//price of Book: 89.9
//
//Process finished with exit code 0