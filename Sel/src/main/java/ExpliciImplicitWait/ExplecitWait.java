package ExpliciImplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitWait {
public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality"
			+ "/explicit-show-hide/defaultcs.aspx");
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement e=driver.findElement(By.xpath("//tbody//td//a[@href='#']"));
	e.click();
//	Thread.sleep(5000);
	
	By locator= By.xpath("//span[@id='ctl00_ContentPlaceholder1_Label1']");
	
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElement(locator, "Thursday, July 1, 2021"));
	
	
	WebElement j=driver.findElement(locator);
	
	String h=j.getText();
	System.out.println(h);
}
}
