package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	// id name linkText xpath
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample9.html");

		Thread.sleep(1000);
		boolean v = driver.findElement(By.id("A1")).isDisplayed();// yes true
		System.out.println(v);

		v = driver.findElement(By.id("A3")).isDisplayed();// no false
		System.out.println(v);

		v = driver.findElement(By.id("A5")).isSelected();// yes true
		System.out.println(v);

		v = driver.findElement(By.id("A6")).isSelected();// no false
		System.out.println(v);

		v = driver.findElement(By.id("A1")).isEnabled();// yes true
		System.out.println(v);

		v = driver.findElement(By.id("A4")).isEnabled();// no false
		System.out.println(v);

	}
}
