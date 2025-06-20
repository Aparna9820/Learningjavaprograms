package n_June_20th_TASKS;
//Check if a Triangle is Valid Based on Three Sides.

public class Check_Triangle {
    public static void main(String[] args) {
        int s1=8,s2=5,s3=1;
        if(s1<=0 || s2<=0 || s3<=0){
            System.out.println("Sides must be greater than 0");
        }else if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2){
            System.out.println("valid triangle");
        }else System.out.println("Not valid triangle");
    }
}
