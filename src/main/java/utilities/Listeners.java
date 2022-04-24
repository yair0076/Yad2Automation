package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener
{
    public void onFinish(ITestContext execution)
    {
        System.out.println("----------Ending Execution-----------");
    }
    public void onStart(ITestContext execution)
    {
        System.out.println("----------Starting Execution-----------");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        //TODO Auto-generated method stub
    }
    public void onTestSkipped(ITestResult test)
    {
        System.out.println("----------Skipping Execution-----------");
    }
    public void onTestFailure(ITestResult test)
    {
        System.out.println("------------ Test "  +test.getName() + " Failed, ------------");

        saveScreenshot();
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void onTestStart(ITestResult test)
    {
        System.out.println("------------ Starting Test: " + test.getName() + "----------");

    }
    public void onTestSuccess(ITestResult test)
    {
        System.out.println("------------ Test: " + test.getName() + " Passed ------------" + test.getName());
        //stop recording
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //delete recorded file
        File file= new File("./test-recordings/"+test.getName()+".avi");
        if (file.delete())
            System.out.println("File Deleted Successfully");
        else System.out.println("Failed to Delete File");
    }
    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public void saveScreenshot() {
        ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
