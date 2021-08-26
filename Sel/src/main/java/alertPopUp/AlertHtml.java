package alertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/wahid/Downloads/alert.html");
		WebElement popUp = driver.findElement(By.xpath("//button[@id='js_alert']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(popUp));

		popUp.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement regPopUp = driver.findElement(By.xpath("//button[@id='html_alert']"));
		wait2.until(ExpectedConditions.elementToBeClickable(regPopUp));
		regPopUp.click();

		By closeBox = By.xpath("/html/body/div[2]/div[1]/button/span[1]");
		driver.findElement(closeBox).click();
		Thread.sleep(4000);
		driver.close();

	}
}
