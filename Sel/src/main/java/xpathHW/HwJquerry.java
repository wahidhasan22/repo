package xpathHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HwJquerry {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//html[@lang='en']//input")).click();;

	
}
}
