package n_June_14th_ENUM;

public class Enum_P4 {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(APIURLS.katalon.getUrl());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}
//https://katalon.com
//
//Process finished with exit code 0

