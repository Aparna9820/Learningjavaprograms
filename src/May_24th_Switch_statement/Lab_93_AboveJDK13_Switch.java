package May_24th_Switch_statement;

public class Lab_93_AboveJDK13_Switch {
    public static void main(String[] args) {

        // in JDK > 13
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
    }
