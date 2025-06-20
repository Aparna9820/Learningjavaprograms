package n_June_9th_tasks_COSTRUCTOR_Classes;

//Create a Rectangle class. Pass length and breadth via constructor, calculate and print area.

public class Lab_216_Task3_Rectangle_Area {
    public static void main(String[] args) {
        Lab_216_Task3_Rectangle_Area r1= new Lab_216_Task3_Rectangle_Area(3.4, 5.6);
        r1.dispaly();
    }
    private double length, breadth, Area;

    Lab_216_Task3_Rectangle_Area(double length, double breadth) {
        this.length = length;
        this.breadth= breadth;
    }
    public double CalculateArea(){
        return length * breadth;
    }

    void dispaly(){
        double Area= CalculateArea();
        System.out.println(Area);
    }
}
