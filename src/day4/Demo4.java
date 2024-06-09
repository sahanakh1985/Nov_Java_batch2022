package day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// open the browser
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);// 1000mili sec->1 sec

		// enter the url in address bar & wait till page is loaded
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);

		URL url = new URL("http://www.fb.com");
		driver.navigate().to(url);
		Thread.sleep(2000);

		// from fb go back to google.com
		driver.navigate().back();
		Thread.sleep(2000);

		// from google to fb
		driver.navigate().forward();
		Thread.sleep(2000);

	}

}
