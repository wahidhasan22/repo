package testNGFirst;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener  {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result)  {

		
		TakesScreenshot sc=(TakesScreenshot)TesterListener.driver;
		//casting driver to TakesScreenshot interface
		//since TakesScreenshot is an interface we cannot create and obj of it
		File src=sc.getScreenshotAs(OutputType.FILE);
		//taking the Sc and storing it into a FileType under src varriable
		//OutputType is a class And .FILE is a static variable of that class
		File dest=new File("Data/Facebook.png");//the location of where we want to save the File
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
