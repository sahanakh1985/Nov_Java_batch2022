package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/dell/Downloads/Sample2.html");
		// xpath matches with 2 element but FE returns 1st one
		driver.findElement(By.xpath("/html/body/a")).click();

		goBack(driver);

		driver.findElement(By.xpath("/html/body/a[1]")).click();

		goBack(driver);

		driver.findElement(By.xpath("/html/body/a[2]")).click();
	}

}
