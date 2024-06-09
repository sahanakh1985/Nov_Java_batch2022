package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/dell/Downloads/Sample1.html");

		driver.findElement(By.xpath("./html/body/a")).click();

		goBack(driver);

		driver.findElement(By.xpath("/html/body/a")).click();
	}

}
