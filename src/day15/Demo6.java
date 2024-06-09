package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
//Drag and drop>dragAndDrop method of Actions class
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");

		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(b1, b3).perform();
	}
}