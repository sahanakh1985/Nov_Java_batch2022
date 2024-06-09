package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void goBack(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/Sample1.html");

		driver.findElement(By.cssSelector("A[ID='a1']")).click();

		goBack(driver);

		driver.findElement(By.cssSelector("a[id=\"a1\"]")).click();

		goBack(driver);

		driver.findElement(By.cssSelector("a[name='n1']")).click();
		goBack(driver);

		driver.findElement(By.cssSelector("a1(class='c1')")).click();

		goBack(driver);

		driver.findElement(By.cssSelector("a[title='click me']")).click();

		goBack(driver);

		driver.findElement(By.cssSelector("a[href='http://www.google.com']")).click();

	}

}
