package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/wahid/Downloads/Selenium.html");
		driver.manage().window().maximize();

		// radio button xpath
		WebElement e = driver.findElement(By.xpath("/html/body/div/div[2]/input[1]"));
		WebElement e1 = driver.findElement(By.xpath("/html/body/div/div[2]/input[2]"));

		WebElement t = driver.findElement(By.xpath("/html/body/div/div[1]/input[1]"));
		WebElement t1 = driver.findElement(By.xpath("/html/body/div/div[1]/input[2]"));
		WebElement t2 = driver.findElement(By.xpath("/html/body/div/div[1]/input[3]"));
		WebElement t3 = driver.findElement(By.xpath("/html/body/div/div[1]/input[4]"));
		// command xpath
		WebElement s = driver.findElement(By.xpath("//*[@id=\"commands\"]/option[1]"));
		WebElement s1 = driver.findElement(By.xpath("//*[@id=\"commands\"]/option[2]"));
		WebElement s2 = driver.findElement(By.xpath("//*[@id=\"commands\"]/option[3]"));
		WebElement s3 = driver.findElement(By.xpath("//*[@id=\"commands\"]/option[4]"));
		WebElement s4 = driver.findElement(By.xpath("//*[@id=\"commands\"]/option[5]"));
		// Clicking on checkbox"one is clicking twice"
		clickOnElement(t);
		clickOnElement(t);
		clickOnElement(t1);
		clickOnElement(t2);
		clickOnElement(t3);
		Thread.sleep(3000);
		// click on Radio button
		clickOnElement(e);
		clickOnElement(e1);
		Thread.sleep(4000);
		// click on commands
		clickOnElement(s);
		clickOnElement(s1);
		clickOnElement(s2);
		clickOnElement(s3);
		clickOnElement(s4);

		Thread.sleep(5000);
		driver.close();

	}

	public static void clickOnElement(WebElement r) {
		Actions ac = new Actions(driver);
		ac.click(r);
		ac.perform();
	}
}
