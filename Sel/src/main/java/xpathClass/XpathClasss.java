package xpathClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClasss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.facebook.com");
	List<WebElement> ls=driver.findElements(By.xpath("(//a[@role='button'])"));
	WebElement e=ls.get(2);
	e.sendKeys("wahtever");
}
}
