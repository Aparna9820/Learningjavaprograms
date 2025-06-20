package n_June_19th_TASKS;

public class Check_Leap_Year {
    public static void main(String[] args) {
        int year=2024;
        if ((year%4==0 && year%100!=100)|| (year%4==0)){
            System.out.println(" Leap year ");
        }
        else
            System.out.println("Not a leap year");
    }
}
