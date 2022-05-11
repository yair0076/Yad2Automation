package extentions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("click on element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("send keys text")
    public static void updateText(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
    //@Step("send keys text as human")
    public static void updateTextHuman(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch: text.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(50, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch+"");
        }
    }
    @Step("drop down select by string")
    public static void updateDropDown(WebElement elem,String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown=new Select(elem);
        dropDown.selectByVisibleText(text);
    }
    @Step("clear text")
    public static void clear(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.clear();
    }
    @Step("mouse over between two elements")
    public static void mouseOver(WebElement elem1,WebElement elem2)
    {
        wait.until(ExpectedConditions.visibilityOf(elem1));
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }
    @Step("double click on element")
    public static void doubleClick(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        action.doubleClick(elem).build().perform();
    }
    @Step("double click on element and clear")
    public static void doubleClickAndClear(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        action.doubleClick(elem).build().perform();
        elem.sendKeys(Keys.BACK_SPACE);

    }
    @Step("right click on element")
    public static void rightClick(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        action.doubleClick(elem).build().perform();
    }
    @Step("drag and drop")
    public static void dragdrop(WebElement drag,WebElement drop)
    {
        wait.until(ExpectedConditions.visibilityOf(drag));
        action.dragAndDrop(drag,drop).build().perform();
    }
    @Step("select multiple elements")
    public static void selectMultiple(List<WebElement> list1)
    {
        action.clickAndHold(list1.get(0)).clickAndHold(list1.get(1)).build().perform();
    }
    @Step("get element from the list by get index")
    public static WebElement getIndex(List<WebElement> list, int index)
    {
        list.get(index);
        return null;
    }
    @Step("scroll")
    public static void scroll(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[o].scrollIntoView(true);",elem);
    }
    @Step("alert popup get text")
    public static void alertPopupGetText(String alert)
    {
        Alert popup = driver.switchTo().alert();
         alert = popup.getText();
        popup.accept();

    }


}
