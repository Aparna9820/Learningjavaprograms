package May_19th_Task;

public class Lab_83_Triangle_Classifier {
    public static void main(String[] args) {
        int s1=6,s2=6,s3=16;
        if((s1 == s2) && (s2 == s3) && (s1==s3)){
            System.out.println("This is equilateral triangle");
        }
        else if ((s1 == s2) || (s2 == s3) || (s1==s3)){
            System.out.println("This is isosceles triangle");
        }
        else {
            System.out.println("This is scalene triangle");
        }


    }
}
