package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PraxDataProvider {
	WebDriver driver;
	
@BeforeClass
public void Browseropen() {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
	String expected="Facebook - Log In or Sign Up";
	String actual=driver.getTitle();
	Assert.assertEquals(expected, actual);
	
	
}
@Test
public void ac(String x, String y) throws InterruptedException {

	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(x);
	driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(y);
	

} 
}
