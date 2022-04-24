package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base {

    public static void initYad2(){
        yad2_Login= PageFactory.initElements(driver,pageObjects.yad2.LoginPage.class);
    }
}
