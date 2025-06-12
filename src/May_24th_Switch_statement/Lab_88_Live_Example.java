package May_24th_Switch_statement;

import java.util.Scanner;

public class Lab_88_Live_Example {
    public static void main(String[] args) {
        //System.out.println("enter any Browser name");
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any Browser name");
        String Browser= scanner.next();
        Browser = Browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome  --->edge case

        switch (Browser){

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Edge":
                System.out.println("Starting the edge");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("i am not having any idea on this Browser");
                break;
        }

    }
}
