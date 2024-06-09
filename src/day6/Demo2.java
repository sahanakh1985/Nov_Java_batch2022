package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// open chrome browser
		WebDriver driver = new ChromeDriver();

		// enter the url & wait till page is loaded
		driver.get("file:///C:/Users/dell/Desktop/Sample1.html");

//		//find the element by tagname (locator) -'a'
//		WebElement element = driver.findElement(By.tagName("a"));
//		
//		//click on that element
//		element.click();

		driver.findElement(By.tagName("a")).click();

	}

}
