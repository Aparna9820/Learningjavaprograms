package n_June_14th_ENUM;

public class ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}

// Enum is nothing
enum URLS {
    google, restassured, katalon, vwo
}

//katalon

//Process finished with exit code 0