package t_July_10th_tasks_Polymorphism;
//Task 4: Login Functionality
//Title: Different login behaviors for users
//Description:
//Create a class User with method login() that prints “User login”.
//Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
//Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.

public class Login_Functionality_task9 {
    public static void main(String[] args) {
        User u=new User();
        u.login();

        User admin= new AdminUser();
        admin.login();

        User Regular= new RegularUser();
        Regular.login();
    }
}
// Base class
class User {
    public void login() {
        System.out.println("User login");
    }
}

// Subclass representing an admin user
class AdminUser extends User {
    @Override
    public void login() {
        System.out.println("Admin user login - Access to admin panel granted.");
    }
}

// Subclass representing a regular user
class RegularUser extends User {
    @Override
    public void login() {
        System.out.println("Regular user login - Welcome to the user dashboard.");
    }
}


//User login
//Admin user login - Access to admin panel granted.
//Regular user login - Welcome to the user dashboard.
//
//Process finished with exit code 0