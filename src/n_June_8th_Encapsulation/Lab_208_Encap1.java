package n_June_8th_Encapsulation;

public class Lab_208_Encap1 {
    public static void main(String[] args) {
        GoodVWOLogin vwoLogin1 =  new GoodVWOLogin("admin","pwd123");
        // System.out.println(vwoLogin1.password);
        System.out.println(vwoLogin1.getUsername());
        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setUsername("pramod");
        System.out.println(vwoLogin1.getUsername());
        vwoLogin1.setPassword("raodask@!@3",true);
        System.out.println(vwoLogin1.getPassword());
    }
}
class GoodVWOLogin{
    private String username;
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Not allowed Set the password, Not a admin!");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

