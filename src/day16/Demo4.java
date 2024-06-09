package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample13.html");
//		WebElement e1 = driver.findElement(By.xpath("//input[@type='text']"));
//		e1.sendKeys("a");

		List<WebElement> e2 = driver.findElements(By.xpath("//input[@type='text']"));
		int count = e2.size();
		System.out.println(count);

//		WebElement v = e2.get(0);
//		v.sendKeys("a");
//		
//		WebElement v2 = e2.get(1);
//		v2.sendKeys("a");

		for (int i = 0; i < count; i++) {
			WebElement v = e2.get(i);
			v.sendKeys("a");
		}

		for (WebElement v : e2) {
			v.sendKeys("b");
		}

	}

}
