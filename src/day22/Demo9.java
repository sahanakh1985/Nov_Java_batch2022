package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/skh/login.do");
		WebElement unTB;
		
		unTB=driver.findElement(By.id("username"));//A -find the element
		driver.navigate().refresh();				//C-refresh the page
		unTB.sendKeys("trainee");						//B- perform action
		
		

	
		

	}
}




















