package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);// links with text ,links without text , hidden links
			String text = link.getText();
			System.out.print(i + " ");
			boolean displayed = link.isDisplayed();
			System.out.print(displayed + " ");
			System.out.println(text);
		}
		driver.quit();
	}

}
