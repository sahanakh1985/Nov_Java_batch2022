package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
//Double Click>doubleClick method of Actions class
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");

		String msg1 = driver.findElement(By.id("box")).getText();
		System.out.println(msg1);

		WebElement button = driver.findElement(By.xpath("//input[@type='button']"));

		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();

		String msg2 = driver.findElement(By.id("box")).getText();
		System.out.println(msg2);

		Thread.sleep(1000);

		driver.quit();
	}
}