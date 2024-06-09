package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

//All the methods of Relative Locators are overloaded
//Relative Locators - Friendly Locators
public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample7.html");
		Thread.sleep(1000);
//		driver.findElement(with(By.tagName("input")).near(By.xpath("//td[.='SQL']"))).click();
		driver.findElement(By.xpath("//td[.='Java']/..//input")).click();

		Thread.sleep(1000);
		driver.get("file:///C:/Users/dell/Documents/Sample8.html");
		Thread.sleep(1000);

//		driver.findElement(with(By.tagName("input")).near(By.xpath("//td[.='SQL']"))).click();
		driver.findElement(By.xpath("//td[.='Java']/..//input")).click();
	}

}
