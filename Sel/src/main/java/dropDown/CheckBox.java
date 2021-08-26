package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wahid/Downloads/Selenium.html");

		driver.findElement(By.xpath("/html/body/div/div[1]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/input[3]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/input[4]")).click();
		Thread.sleep(6000);
		
	}
}
