package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo6 {
	// id name linkText xpath
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));

		String tag = errMsg.getTagName();
		System.out.println(tag);

		String eClass = errMsg.getAttribute("class");
		System.out.println(eClass);

		String text = errMsg.getText();
		System.out.println(text);

		String rgbColor = errMsg.getCssValue("color");
		System.out.println(rgbColor);
		String hexaColor = Color.fromString(rgbColor).asHex();
		System.out.println(hexaColor);

		String fontType = errMsg.getCssValue("font-family");
		System.out.println(fontType);

		String fontSize = errMsg.getCssValue("font-size");
		System.out.println(fontSize);

		driver.quit();

	}
}
