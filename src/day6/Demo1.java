package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/Sample1%20-%20Copy.html");
		String title = driver.getTitle();
		System.out.println(title);

		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);

		driver.quit();

	}

}
