package day20;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	// html popup

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
		Thread.sleep(1000);
		String xp = "//input[@type='text' and not(@name='q')]";
		driver.findElement(By.xpath(xp)).sendKeys("Bhanu");

	//	String xp2 = "//button[text()='✕']";
	//	driver.findElement(By.xpath(xp2)).click();
		driver.close();

	}

}
