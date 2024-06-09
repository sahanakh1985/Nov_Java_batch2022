package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
// Context Menu
// Context Click-right clicking on the element->contextClick method of Actions class
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Paste']")).click();
	}
}