package testListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracListener {
static WebDriver driver;
@Test
public void FirstTest() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	String actual=driver.getTitle();
	String exp="Whatever";
	Assert.assertEquals(actual, exp);
	Thread.sleep(4000);
	driver.close();
}
}
