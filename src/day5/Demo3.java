package day5;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String htmlCodeOfThePage = driver.getPageSource();
		System.out.println(htmlCodeOfThePage);
		driver.quit();

	}

}
