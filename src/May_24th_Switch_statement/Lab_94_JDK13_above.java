package May_24th_Switch_statement;

public class Lab_94_JDK13_above {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
