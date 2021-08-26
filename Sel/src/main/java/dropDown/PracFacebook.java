package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracFacebook {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s=new Select(e);
	s.selectByVisibleText("Nov");
	WebElement y=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select sc= new Select(y);
	sc.selectByIndex(22);
}
}

