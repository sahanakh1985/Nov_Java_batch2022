package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
