package day13;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
//png-->Portable Network Graphics
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("username"));
		File img1 = unTB.getScreenshotAs(OutputType.FILE);// to take the screenshot of unTB
		String path = img1.getAbsolutePath();// temp
		System.out.println(path);
		Thread.sleep(20000);
//		driver.quit();

	}
}
