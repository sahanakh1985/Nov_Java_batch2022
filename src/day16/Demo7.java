package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//print the content of the web table
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Documents/Sample5.html");
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));

		for (WebElement cell : allCells) {
			System.out.println(cell.getText());
		}

		driver.quit();
	}

}
