package n_June_14th_Static_Keyword;

public class Static_P2 {
    public static void main(String[] args) {
        ATB umesh = new ATB(987654321,"Umesh");
        ATB anubha = new ATB(987654387,"Anumba");
        System.out.println(umesh.phone_np);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.markAttendance();
        umesh.display();
        anubha.display();
    }
}

class ATB{

    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np   +   this.name +   course_name);
    }

    static void markAttendance(){
        System.out.println("Mark Attendance");
    }
}

//987654321
//Anumba
//ATB
//ATB
//Mark Attendance
//987654321UmeshATB
//987654387AnumbaATB
//
//Process finished with exit code 0