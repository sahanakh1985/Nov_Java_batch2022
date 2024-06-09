package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Sahana");

		// it will open the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// enter the URL and wait till page is loaded
		driver.get("http://www.google.com");
		// close the browser

		driver.close();

	}

}
