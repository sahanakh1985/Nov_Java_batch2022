package day5;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();

		// enter the url
		// driver.get("https://demo.actitime.com/login.do");
		driver.get("https://online.actitime.com/skh/login.do");
		Thread.sleep(1000);

		// find the un (active element)
		WebElement unTB = driver.switchTo().activeElement();

		// type 'admin'
		unTB.sendKeys("trainee");

		Thread.sleep(1000);

		// press tab so that control goes to pwd
		unTB.sendKeys(Keys.TAB);

		// get the active element (pwd)
		WebElement pwTB = driver.switchTo().activeElement();
		// type manager in pwd
		pwTB.sendKeys("trainee");
		Thread.sleep(1000);
		// press enter so that it logs in
		pwTB.sendKeys(Keys.ENTER);

	}
}
