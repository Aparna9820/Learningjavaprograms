package t_July_9th_tasks_Inheritance;

//Task 3: "Multilevel Login System"
//📄 Description: (Multilevel Inheritance)
//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().
//Use an object of SuperAdmin to call all three methods.

public class Multilevel_Login_System {
    public static void main(String[] args){
        SuperAdmin s1= new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutdownSystem();
    }
}
class User{
    void login(){
        System.out.println("login user!");
    }
}
class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("AccessAdminPanel User!");
    }
}
class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("ShutdownSystem!");
    }
}

//login user!
//AccessAdminPanel User!
//ShutdownSystem!
//
//Process finished with exit code 0