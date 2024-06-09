package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// open the browser
		WebDriver driver = new ChromeDriver();
		// enter the url in address bar & wait till page is loaded
		driver.get("http://www.fb.com");
		// get the title of the page
		String title = driver.getTitle();
		// print the title
		System.out.println(title);
		// get the url present in addressbar
		String url = driver.getCurrentUrl();
		// print the url
		System.out.println(url);
		// close the browser
		driver.close();

	}
}
