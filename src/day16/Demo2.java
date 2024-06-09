package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.actimind.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ourClient = driver.findElement(By.xpath("//h3[contains(text(),'Our client')]"));

		Actions actions = new Actions(driver);
		actions.scrollToElement(ourClient).perform();
	}
}
