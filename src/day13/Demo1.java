package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	// id name linkText xpath
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample9.html");
		WebElement element = driver.findElement(By.id("A1"));
		Thread.sleep(1000);
		element.clear();
		Thread.sleep(1000);
		element.sendKeys("Ravi");
	}
}
