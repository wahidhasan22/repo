package rowAndCell;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustXpathRow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/wahid/eclipse-workspace/Sel/html/sample.html");
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= 2; j++) {
				String cp = "//tr[" + i + "]" + "/td[" + j + "]";
				WebElement e = driver.findElement(By.xpath(cp));
				String p = e.getText();
				System.out.println(p);
			}
		}
	}
}
