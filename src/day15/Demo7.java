package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {
//How to perform drag and drop without using dragAndDrop method
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		Thread.sleep(1000);
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));

		Actions actions = new Actions(driver);
		actions.clickAndHold(b1).moveToElement(b3).pause(Duration.ofSeconds(3)).release().perform();
	}
}