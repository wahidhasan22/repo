package firstPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFirstP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/wahid/Downloads/Selenium.html");
		WebElement e = driver.findElement(By.xpath("/html/body/div/div[1]/p/strong"));
		System.out.println("__________");
		Select set = new Select(e);
		boolean b = set.isMultiple();
		System.out.println(b);

		Thread.sleep(5000);
		WebElement First = driver.findElement(By.xpath("//input[@name='firstname']"));
		First.sendKeys("Wahid");
		WebElement Last = driver.findElement(By.xpath("//input[@name='lastname']"));
		Last.sendKeys("Hasan");

		WebElement t = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(t);
		sel.selectByVisibleText("Jan");

		List<WebElement> all = sel.getOptions();
		for (WebElement s : all) {
			String h = s.getText();
			System.out.println(h);
		}

	}
}
