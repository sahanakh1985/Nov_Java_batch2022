package day2;

import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();

		driver.get("http://www.google.com");

		driver.quit();
	}

}
