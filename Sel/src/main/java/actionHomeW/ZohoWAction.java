package actionHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZohoWAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement signUp = driver.findElement(By.xpath("//a[@class='zh-signup']"));

		act.click(signUp).perform();
		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement drop = driver.findElement(By.xpath("//select[@class='za-globalstate-signup']"));
		WebElement checkBox = driver.findElement(By.xpath("//span[@class='unchecked']"));
		By locator = By.xpath("//select[@class='za-globalstate-signup']");
		WebDriverWait wait = new WebDriverWait(driver, 6);
		wait.until(ExpectedConditions.elementToBeClickable(locator));

		act.sendKeys(Email, "Wahid.sample@gmail.com");
		act.sendKeys(Pass, "WhatEver");
		act.click(checkBox);

		Thread.sleep(2000);
		Select sl = new Select(drop);
		sl.selectByVisibleText("Nevada");
		Thread.sleep(2000);

		act.click(Email);
		act.sendKeys(Email, Keys.CONTROL.ARROW_LEFT).clickAndHold();
		// act.doubleClick();
		act.perform();
		Thread.sleep(3000);

		// driver.close();

	}
}
