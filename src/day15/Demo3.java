package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
//Drop down menu
//Mouse hover- placing the mouse pointer on the element->moveToElement method of Actions class
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Web Crawling']")).click();
	}
}
