package workflow;

import com.google.common.util.concurrent.Uninterruptibles;
import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.time.Duration;

public class Yad2Flows extends CommonOps {


    @Step("Business flow: login")
    public static void login(String user,String pass)  {
        UIActions.updateText(yad2_Login.txt_mail, user);
        UIActions.updateText(yad2_Login.txt_password, pass);
        UIActions.click(yad2_Login.btn_login);
    }
    @Step("business flow: login procses for DDT")
    public static void loginForTestProcess(String user,String pass,String result){
        UIActions.updateTextHuman(yad2_Login.txt_mail, user);
        UIActions.updateTextHuman(yad2_Login.txt_password, pass);
        UIActions.click(yad2_Login.btn_login);
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(1));
        UIActions.click(yad2_Login.txt_mail);
        UIActions.click(yad2_Login.btn_close);
        UIActions.doubleClickAndClear(yad2_Login.txt_password);
        System.out.println(result);
        switch (result){
            case "miss@":
                Verifications.VerifyisDisplayElement(yad2_Login.txt_forgotMailWithSymbol);
            case "missMail":
                Verifications.VerifyisDisplayElement(yad2_Login.txt_forgotMail);
            case "missPass":
                Verifications.VerifyTextInElement(yad2_Login.link_forgotPassword,"לא לשכוח להזין סיסמה");
            case "missMailAndPass":
                Verifications.VerifyisDisplayElement(yad2_Login.txt_forgotMail);
                Verifications.VerifyTextInElement(yad2_Login.link_forgotPassword,"לא לשכוח להזין סיסמה");
        }
    }
    //@Step("Business flow: create new user")
   // public static void createNewUser(String Name,String Email,String userName,String pass)
    //{
        //UIActions.click(grafana_ServerAdminMainPage.btn_user);
        //UIActions.updateText(grafana_ServerAdminAddNewUser.txt_name, Name);
        //UIActions.updateText(grafana_ServerAdminAddNewUser.txt_username, userName);
        //UIActions.updateText(grafana_ServerAdminAddNewUser.txt_email, Email);
        //UIActions.updateText(grafana_ServerAdminAddNewUser.txt_password, pass);
        //UIActions.click(grafana_ServerAdminAddNewUser.btn_create);
    //}
    //@Step("Business flow: delete last user")
    //public static void deleteLastUser()
    //{
        //UIActions.click(grafana_ServerAdminMainPage.rows.get(grafana_ServerAdminMainPage.rows.size()-1));
       // UIActions.click(grafana_ServerAdminMainPage.link_userMail);
        //UIActions.click(grafana_ServerAdminEditUserPage.btn_deleteUser);
    //UIActions.click(grafana_ServerAdminEditUserPage.btn_confirmDeleteUser);

    //}
    //@Step("Business flow: search and verify user")
   // public static void searchAndVerifyUser(String user,String shouldExist)  {
       // UIActions.updateTextHuman(grafana_ServerAdminMainPage.txt_search,user);
       // if (shouldExist.equalsIgnoreCase("exists"))
            //Verifications.existanceOfElement(grafana_ServerAdminMainPage.rows);
        //else if (shouldExist.equalsIgnoreCase("not-exists"))
            //Verifications.nonExistanceOfElement(grafana_ServerAdminMainPage.rows);
        //else throw new RuntimeException("Invalid Expected Output in Data Driven Testing");

   // }
}
