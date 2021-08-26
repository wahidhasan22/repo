package ExpliciImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		By locator= By.xpath("//div[@id='start']/button");
		By HelloWorld= By.xpath("//div[@id='finish']/h4");
		driver.findElement(locator).click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(HelloWorld, "Hello World!"));
		WebElement e=driver.findElement(HelloWorld);
		String h=e.getText();
		System.out.println(h);
		driver.close();
		
	}
}
