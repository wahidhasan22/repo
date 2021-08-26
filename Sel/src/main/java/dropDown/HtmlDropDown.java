package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/wahid/Downloads/Selenium.html");
		WebElement e = driver.findElement(By.xpath("//*[@id=\"issues\"]"));

		Select sel = new Select(e);
		boolean b = sel.isMultiple();
		System.out.println(b);
		sel.selectByIndex(4);
		Thread.sleep(5000);
		sel.selectByVisibleText("Improvement");
		Thread.sleep(5000);
		List<WebElement> as = sel.getOptions();
		for (WebElement r : as) {
			System.out.println(r.getText());
			r.findElement(By.xpath("//*[@id=\"issues\"]/option[4]")).click();
			if(r.getText().equals("Bug")) {
				System.out.println("Is Highlighted");
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}
