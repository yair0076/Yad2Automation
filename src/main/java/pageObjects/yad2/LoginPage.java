package pageObjects.yad2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage {
    @FindBy(how = How.CLASS_NAME,using = "main-logo")
    public WebElement link_mainLogo;
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/div/header/a/img")
    public WebElement img_mainLogo;
    @FindBy(how = How.CLASS_NAME,using = "title-medium")
    public WebElement title_goodToSeeYou;
    @FindBy(how = How.CLASS_NAME,using = "title-large")
    public WebElement title_buyFaster;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[2]/ul[1]/li[1]/img[1]")
    public WebElement img_bell;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[2]/ul[1]/li[2]/img[1]")
    public WebElement img_chat;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[2]/ul[1]/li[3]/img[1]")
    public WebElement img_airplane;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[2]/ul[1]/li[4]/img[1]")
    public WebElement img_privateArea;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[1]/div[1]/form[1]/fieldset[1]/div[1]/button[1]")
    public WebElement btn_login;
    @FindBy(how = How.LINK_TEXT,using = "להרשמה")
    public WebElement link_toRegister;
    @FindBy(how = How.LINK_TEXT,using = "שכחתי סיסמה")
    public WebElement link_forgotPassword;
    @FindBy(how = How.ID,using = "email")
    public WebElement txt_mail;
    @FindBy(how = How.ID,using = "password")
    public WebElement txt_password;
    @FindBy(how = How.CLASS_NAME,using = "input-text-show-password-button")
    public WebElement btn_howPasswordEye;
    @FindBy(how = How.XPATH,using = "//p[contains(text(),'לא לשכוח את המייל')]")
    public WebElement txt_forgotMail;
    @FindBy(how = How.XPATH,using = "//p[contains(text(),'משהו לא תקין במייל, אולי התפספס @?')]")
    public WebElement txt_forgotMailWithSymbol;
    @FindBy(how = How.XPATH,using = "//p[@class='form-text-message is-error' and text()='לא לשכוח להזין סיסמה']")
    public WebElement txt_forgotPassword;
    @FindBy(how = How.CLASS_NAME,using = "y2i_Hide")
    public WebElement btn_EyeHide;
    @FindBy(how = How.CLASS_NAME,using = "y2i_Show")
    public WebElement btn_EyeShow;
    @FindBy(how = How.CLASS_NAME,using = "y2i_close")
    public WebElement btn_close;
    @FindBy(how = How.ID,using = "re-entered-password")
    public WebElement txt_reenteredPassword;
    @FindBy(how = How.LINK_TEXT,using = "להתחברות")
    public WebElement link_toLogin;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'המשך')]")
    public WebElement txt_continueOnButton;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'התחברות')]")
    public WebElement txt_loginOnButton;
    @FindBy(how = How.XPATH,using = "//p[contains(text(),'המייל או הסיסמה אינם תקינים')]")
    public WebElement txt_incorrectMailOrPassword;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'התראות')]")
    public WebElement txt_notification;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'צ׳אט')]")
    public WebElement txt_chat;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'פרסום מודעה')]")
    public WebElement txt_advertising;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'אזור אישי')]")
    public WebElement txt_privateArea;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[1]/div[1]/form[1]/fieldset[1]/ul[1]/li[1]/label[1]/span[2]")
    public WebElement txtS_mail;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'סיסמה')]")
    public WebElement txtS_password;
    @FindBy(how = How.XPATH,using = "//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/section[1]/div[1]/form[1]/fieldset[1]/p[1]")
    public WebElement txtS_missAccount;
    @FindBy(how = How.XPATH,using = "//u[contains(text(),'כניסה למתווכים')]")
    public WebElement txtS_mediator;




}
