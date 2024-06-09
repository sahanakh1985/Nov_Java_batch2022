package day21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//print title of all the browsers
//close all the browser without using quit
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
