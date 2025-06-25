package n_June_25th_tasks;

public class Task5_Parameterized_Const {
    public static void main(String[] args) {
        student s= new student("aparna");
        s.display();

    }
}
class student{
     String name;

     student(String name) {
         this.name = name;
     }
     void display(){
         System.out.println("Student name: "+name);
     }
}
//Student name: aparna
//
//Process finished with exit code 0