package testListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListNer implements ITestListener  {
	public void onTestFailure(ITestResult result) {
		TakesScreenshot tc = (TakesScreenshot) PracListener.driver;
		File src = tc.getScreenshotAs(OutputType.FILE);
		File dest= new File("ScreenShot/Picture.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
