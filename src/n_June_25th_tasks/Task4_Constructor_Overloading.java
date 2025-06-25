package n_June_25th_tasks;

public class Task4_Constructor_Overloading {
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person("sarala");
        person p3=new person("Ajay", 32);
        p1.display();
        p2.display();
        p3.display();
    }
}
class person{
    String name;
    int age;
    person(){
        name= "Appu";
        age=25;
    }

    person(String name){
        this.name=name;
        age=30;
    }
    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("person name: "+ name +" & "+ " age "+age );
    }
}
//person name: Appu &  age 25
//person name: sarala &  age 30
//person name: Ajay &  age 32
//
//Process finished with exit code 0