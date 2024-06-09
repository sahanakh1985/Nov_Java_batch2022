package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement searchTextBox = driver.switchTo().activeElement();
		searchTextBox.sendKeys("akshara training");
	}

}
