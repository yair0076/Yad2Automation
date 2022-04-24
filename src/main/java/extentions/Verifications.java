package extentions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("verify element  if is displayed")
    public static void VerifyVisitableElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isDisplayed());
    }
    @Step("verify element  if is displayed without assert")
    public static void VerifyisDisplayElement(WebElement elem) {
        //wait.until(ExpectedConditions.visibilityOf(elem));
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(3));
        elem.isDisplayed();
    }
    @Step("verify element  if is enabled")
    public static void VerifyEnableElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isEnabled());
    }
    @Step("verify element  if is enabled without assert")
    public static void VerifyisEnableElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.isEnabled();
    }
    @Step("verify element  if is selected")
    public static void VerifySelectedElement(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertTrue(elem.isSelected());
    }
    @Step("verify text element in element")
    public static void VerifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        softAssert.assertEquals(elem.getText(), expected);
    }
    @Step("verify the size of element//list ")
    public static void VerifyNumOfElements(List<WebElement> elems, int excepted) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        assertEquals(elems.size(), excepted);
    }
    @Step("verify element displayed//soft assertions//list")
    public static void VerifyVisibilityOfElements(List<WebElement> elems) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "sorry" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("some elements were not displayed");
    }
    @Step("verify img displayed//soft assertions//list")
    public static void VerifyVisibilityOfImg(List<WebElement> elems) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "sorry" + elem + "not displayed");
        }
        softAssert.assertAll("some elements were not displayed");
    }
    @Step("verify element location//soft assertions//list")
    public static void VerifyLocationOfElements(List<WebElement> elems,String exceptedLocation) {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size() - 1)));
        for (WebElement elem : elems) {
            softAssert.assertEquals(elem.getLocation().toString(),exceptedLocation);
        }
        softAssert.assertAll("some elements were not location correct");
    }

    @Step("verify element displayed ")
    public static void existanceOfElement(List<WebElement> elements)
     {
        assertTrue(elements.size()>0);
    }
    @Step("verify element not displayed ")
    public static void nonExistanceOfElement(List<WebElement> elements)
     {
        assertFalse(elements.size()>0);
    }
    @Step("verify element displayed according expected number ")
    public static void existanceOfElement(List<WebElement> elements,int expectedNumber) {
        assertTrue(elements.size()==expectedNumber);
    }

    @Step("verify element location")
    public static void verifyLocation(WebElement elem, String exceptedLocation){
        String actualLocation = elem.getLocation().toString();
        softAssert.assertEquals(actualLocation,exceptedLocation);
        softAssert.assertAll();
    }



}
