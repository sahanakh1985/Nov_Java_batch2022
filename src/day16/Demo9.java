package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		Thread.sleep(1000);
		String xp = "//div[contains(text(),'iphone')]";
		Thread.sleep(1000);
		List<WebElement> allASE = driver.findElements(By.xpath(xp));

		int count = allASE.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String text = allASE.get(i).getText();
			System.out.println(text);

		}
		Thread.sleep(1000);
		// allASE.get(0).click();
		String expected = "iphone 14 pro max";
		for (int i = 0; i < count; i++) {
			String text = allASE.get(i).getText();
			if (expected.equals(text)) {
				allASE.get(i).click();
				break;
			}
		}

		// driver.quit();

	}

}
