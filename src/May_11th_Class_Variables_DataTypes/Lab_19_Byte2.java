package May_11th_Class_Variables_DataTypes;

public class Lab_19_Byte2 {
    public static void main(String[] args) {
        byte age=40;
        System.out.println(age);   //o/p--> it print only 40 not 89 because JVM recognizes only single main method
    }

    public static void main(int [] args) {
        byte age=89;
        System.out.println(age);

    }
}
