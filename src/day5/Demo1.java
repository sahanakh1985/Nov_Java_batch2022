package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
	}

}
