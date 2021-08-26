package actionHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionHW {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com");
		Thread.sleep(5000);
		

		Actions act = new Actions(driver);
		WebElement u = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[6]"));
		act.click(u);

		WebElement s = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[6]"));
		act.click(s);
		WebElement t = driver.findElement(By.xpath("//*[@id=\"emailfield\"]"));
		t.sendKeys("wahid.sample@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("whatever22");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//*[@id=\"signupform\"]/div/div[5]/select"));
		dropDown(e);
		Thread.sleep(2000);
		WebElement r = driver.findElement(By.xpath("#signup-termservice"));

//		driver.findElement(By.id("emailfield")).click();
		act.click(s);

		act.click(r);
//		WebElement t = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[6]"));
//
//		t.sendKeys(Keys.CONTROL+"a");
		act.perform();
	}

	public static void dropDown(WebElement c) {
		Select s = new Select(c);
		s.selectByVisibleText("Nevada");

	}

}
