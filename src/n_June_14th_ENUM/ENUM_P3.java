package n_June_14th_ENUM;

public class ENUM_P3 {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getHexCode());
    }
}
enum Colors{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    Colors(String hexCode){
        this.hexCode = hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }



}

//#FF0000
//
//Process finished with exit code 0