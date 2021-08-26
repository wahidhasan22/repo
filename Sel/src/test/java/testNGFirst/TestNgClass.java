package testNGFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgClass {
	WebDriver driver;
	SoftAssert sof = new SoftAssert();

	@BeforeClass
	public void driverpath() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void test1() {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		String expected = "Facebook - Log In or Sign Up 33";

		String actual = driver.getTitle();
		sof.assertEquals(true, true);

		Assert.assertEquals(expected, actual);

	}

	@Test(priority = 2, enabled = true, dataProvider = "dp")
	public void ac() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Wahid");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hasan");

		By password = By.xpath(
				"//input[@name='firstname']/ancestor::div[@id='fullname_field']/following-sibling::div[@class='mbm _br- _a4y']/descendant::input\r\n"
						+ "");
		driver.findElement(password).click();
		;
		driver.findElement(password).sendKeys("whatEver22");

	}

	@Test(priority = 3)
	public void google() {
		driver.get("http://www.google.com");
		String expected = driver.getTitle();
		String actual = "Google";
		Assert.assertEquals(expected, actual);
	}

}
