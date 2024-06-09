package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	// id name linkText xpath
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample9.html");

		Thread.sleep(1000);
		driver.findElement(By.id("A7")).click(); // click on normal button
		Thread.sleep(1000);
//		driver.findElement(By.id("A8")).click();
		driver.findElement(By.id("A8")).submit();// click on submit button

	}
}
