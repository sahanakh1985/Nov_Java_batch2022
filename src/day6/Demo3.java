package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/dell/Desktop/Sample1%20-%20Copy.html");

		driver.findElement(By.tagName("b")).click();

	}

}
