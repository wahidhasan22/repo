package testNGFirst;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TesterListener {
	static WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		String expected = "Facebook - Log In or Sign Up 11";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}

}
