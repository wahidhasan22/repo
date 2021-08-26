package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.facebook.com");
	
	TakesScreenshot sc=(TakesScreenshot)driver;//casting driver to TakesScreenshot interface
	//since TakesScreenshot is an interface we cannot create and obj of it
	File src=sc.getScreenshotAs(OutputType.FILE);
	//taking the Sc and storing it into a FileType under src varriable
	//OutputType is a class And .FILE is a static variable of that class
	File dest=new File("Data/Picture.png");//the location of where we want to save the File
	FileUtils.copyFile(src, dest);
	
}
}
