package day20;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/dell/Documents/Sample17.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A3")).click();
		driver.findElement(By.id("PageLink_5")).click();
		driver.findElement(By.id("GenericLink_3")).click();
		// home work- check file is present or not

	}

}
