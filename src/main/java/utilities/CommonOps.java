package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

public class CommonOps extends Base {

    public static String getData(String nodeName)
    {
        File fxmlFile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc=null;
        try {
            fxmlFile=new File("./Configuration/DataConfig.xml");
            dbFactory= DocumentBuilderFactory.newInstance();
            dBuilder=dbFactory.newDocumentBuilder();
            doc=dBuilder.parse(fxmlFile);
            doc.getDocumentElement().normalize();
        }
        catch (Exception e)
        {
            System.out.println("Error Reading XML file:"+e);
        }
        finally {

            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }

    public void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("chrome"))
            driver=initChromeDriver();
        else if (browserType.equalsIgnoreCase("firefox"))
            driver=initFirefoxDriver();
        else if (browserType.equalsIgnoreCase("ie"))
            driver=initIeDriver();
        else  throw new RuntimeException("invalit init browser");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.get(getData("url"));
        ManagePages.initYad2();
        action=new Actions(driver);

    }
    public WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    public WebDriver initFirefoxDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        return driver;
    }
    public WebDriver initIeDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver=new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass(alwaysRun = true)
    public void StartSession()
    {
        if (getData("PlatformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
        else throw new RuntimeException("invalit platform name");
        softAssert=new SoftAssert();
        screen=new Screen();

    }
    @AfterClass public void CloseSession()
    {
        driver.quit();
    }
    @BeforeMethod public void BeforeMethod(Method method)
    {
        try {
            MonteScreenRecorder.startRecord(method.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }



