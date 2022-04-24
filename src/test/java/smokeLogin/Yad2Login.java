package smokeLogin;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;
import pageObjects.yad2.LoginPage;
import utilities.CommonOps;
import utilities.RetryAnalyzer;
import workflow.Yad2Flows;


public class Yad2Login extends CommonOps {

    @Test(retryAnalyzer = RetryAnalyzer.class,description = "Test01_displyTitleLogin",groups = {"Verify Display text and location titles"})
    @Description("this test verify the display titles in login page")
    public void Test01_displayMainLogo()
    {
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.img_mainLogo);
        Verifications.VerifyisEnableElement(Yad2Login.yad2_Login.img_mainLogo);
        Verifications.verifyLocation(Yad2Login.yad2_Login.img_mainLogo,"(1117, 300)");
    }
    @Test(description = "Test02_displayTitlesLogin",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles login text and location")
    public void Test02_displayLoginTitlesText()
    {
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.title_goodToSeeYou, "היי, טוב לראות אותך");

    }
    @Test(description = "Test03_verifyLocation",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles login text and location")
    public void Test03_verifyLocationTitlesText()
    {
        Verifications.verifyLocation(Yad2Login.yad2_Login.title_goodToSeeYou, "(736, 164)");
    }
    @Test(description = "Test04_displayTitlesLogin",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles login text and location")
    public void Test04_displayLoginTitlesText()
    {
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.title_buyFaster, "לקנות מהר, למכור מהר.\n" +
                "ויש לנו אחלה כלים לזה." +
                "ויש לנו אחלה כלים לזה.");
    }
    @Test(description = "Test05_verifyLocation",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles login text and location")
    public void Test05_VrifyLocationTitlesText()
    {
        Verifications.verifyLocation(Yad2Login.yad2_Login.title_buyFaster, "(74, 271)");
    }
    @Test(description = "Test06_displayTitlesSmall",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles small display, and location with list and soft assertion")
    public void Test06_displayTitlesSmall()
    {
      Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.txtS_mail);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.txtS_password);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.txtS_missAccount);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.txtS_mediator);

    }
    @Test(description = "Test07_verifyLocationElements",groups = {"Verify Display text and location titles"})
    @Description("this test verify the location of elements")
    public void Test07_verifyLocationElements()
    {
       Verifications.verifyLocation(Yad2Login.yad2_Login.txtS_mail,"(1128, 238)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.txtS_password,"(1110, 344)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.txtS_missAccount,"(736, 571)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.txtS_mediator,"(736, 658)");
    }
    @Test(description = "Test08_VerifyDisplayCorrectText",groups = {"Verify Display text and location titles"})
    @Description("this test verify the correct display text")
    public void Test08_VerifyCorrectTitlesText()
    {
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txtS_mail,"מייל");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txtS_password,"סיסמה");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txtS_missAccount,"אין לך חשבון?");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txtS_mediator,"כניסה למתווכים");
    }
    @Test(description = "Test09_displayTitlesLoginFeatures",groups = {"Verify Display text and location titles"})
    @Description("this test verify the titles login features display, and location with list and soft assertion")
    public void Test09_displayTitlesLoginFeatures()
    {
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.img_bell);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.img_chat);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.img_airplane);
        Verifications.VerifyisDisplayElement(Yad2Login.yad2_Login.img_privateArea);
    }
    @Test(description = "Test10_verifyLocationElements",groups = {"Verify Display text and location titles"})
    @Description("this test verify the location of elements")
    public void Test10_verifyLocationElements()
    {
        Verifications.verifyLocation(Yad2Login.yad2_Login.img_bell,"(441, 394)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.img_chat,"(324, 394)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.img_airplane,"(191, 394)");
        Verifications.verifyLocation(Yad2Login.yad2_Login.img_privateArea,"(74, 394)");
    }
    @Test(description = "Test11_VerifyDisplayCorrectText",groups = {"Verify Display text and location titles"})
    @Description("this test verify the correct display text")
    public void Test11_VerifyCorrectTitlesText()
    {
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txt_notification, "התראות");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txt_chat, "צ׳אט");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txt_advertising, "פרסום מודעה");
        Verifications.VerifyTextInElement(Yad2Login.yad2_Login.txt_privateArea, "אזור אישי");
    }
    @Test(description = "Test12_verifyLoginErrorOptions",dataProvider = "data-provider-login",dataProviderClass = utilities.ManageDDT.class,groups = {"Login Process"})
    @Description("this test verify login error options with DDT and switch case")
    public void Test12_VerifyLoginErrorOptions(String user,String pass,String result){
        System.out.println(user+pass+result);
        Yad2Flows.loginForTestProcess(user, pass, result);
    }


}
