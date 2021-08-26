package MutipleWindoHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHotels {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.hotels.com");
	Thread.sleep(5000);
//	WebDriverWait wait= new WebDriverWait(driver,10);
	
	WebElement deals= driver.findElement(By.xpath("//a[text()='Deals']"));
	deals.click();

//	wait.until(ExpectedConditions.elementToBeClickable(deals));
	Thread.sleep(5000);

	WebElement thingsToDo= driver.findElement(By.xpath("//a[text()='Things to do']"));
	String current=driver.getWindowHandle();
	thingsToDo.click();
	Set<String> all=driver.getWindowHandles();
	for(String id:all) {
		if(!id.equals(current)) {
			driver.switchTo().window(id);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='uitk-faux-input']")).click();
			driver.findElement(By.xpath("//button[@class='uitk-faux-input']")).sendKeys(" Japan");
		}
	}
	
	
}
}
