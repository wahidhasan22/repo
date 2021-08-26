package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Actions act= new Actions(driver);
	Thread.sleep(5000);
	WebElement t=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement e=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	act.dragAndDrop(t, e);
	
	
	act.perform();
}
}
