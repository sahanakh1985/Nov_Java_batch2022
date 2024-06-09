package day21;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//print the titles in their corresponding browser

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String parent = driver.getWindowHandle();

		driver.get("file:///C:/Users/dell/Documents/Sample17.html");
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);

		for (String w : allWHS) {
			driver.switchTo().window(w);
			String title = driver.getTitle();
//			System.out.println(title);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(title);
		}

	}

}
