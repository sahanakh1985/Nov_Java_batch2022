package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample7.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='Java']/../td[1]/input")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[.='Java']/preceding-sibling::td/input")).click();
	}

}
