package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo9 {

	// Context Menu
	// Context Click-right clicking on the element->contextClick method of Actions
	// class
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='right click me']")));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		WebElement pasteOption = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Paste']")));
		pasteOption.click();
		driver.quit();
	}
}
