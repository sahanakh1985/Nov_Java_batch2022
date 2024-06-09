package day21;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//how do u handle new tab in selenium-using getWindowHandles with switchTo().window(wh);
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/skh/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();// new tab
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());

		for (String wh : allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}

		driver.findElement(By.xpath("//a[text()='Get started']")).click();
	}

}
