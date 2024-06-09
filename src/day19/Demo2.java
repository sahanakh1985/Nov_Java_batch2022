package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample16.html");
		WebElement listbox1 = driver.findElement(By.id("A1"));
		Select select1 = new Select(listbox1);
		select1.selectByValue("c");
		Thread.sleep(1000);

		WebElement listBox2 = driver.findElement(By.id("A2"));
		Select select2 = new Select(listBox2);

		System.out.println(select2.isMultiple());// true
		Thread.sleep(1000);
		select2.selectByIndex(0);
		// Thread.sleep(1000);
		// select.selectByIndex(0);

		Thread.sleep(1000);
		select2.selectByValue("b");
		Thread.sleep(1000);
		select2.selectByVisibleText("Snacks");
		Thread.sleep(1000);
		select2.deselectByIndex(0);
		Thread.sleep(1000);
		select2.deselectByValue("b");
		Thread.sleep(1000);
		select2.deselectByVisibleText("Snacks");

		WebElement listBox3 = driver.findElement(By.id("A3"));
		Select select3 = new Select(listBox3);
		select3.deselectAll();
	}
}
