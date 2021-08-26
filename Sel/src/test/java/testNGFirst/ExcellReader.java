package testNGFirst;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExcellReader {
	WebDriver driver;


	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	}
	
	@Test(dataProvider = "dp")
	public void ac(String x, String y,String z) throws InterruptedException {
		
		
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(x);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(y);
		By year=By.xpath("//select[@id='year']");
		Select s=new Select(driver.findElement( year));
		s.selectByVisibleText(z);

	}

	
	
	
	@DataProvider(name = "dp")
	public Object[][] datafedder() throws IOException {
		
		String fileName = "Data/NameList.xlsx";
		String sheetName = "Sheet1";
		ExcelReader reader = new ExcelReader();
		Object[][] t = reader.excelToTwoDArray(fileName, sheetName);
		
		
		return t;
	}
	

}
