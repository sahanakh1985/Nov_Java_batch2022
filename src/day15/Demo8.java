package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Demo8 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		WebElement beforeClick = driver.findElement(By.xpath("//div[.=' Double Click   here']"));
		String rgbColor1 = beforeClick.getCssValue("color");
		System.out.println(rgbColor1);
		String hexaColor1 = Color.fromString(rgbColor1).asHex();
		System.out.println(hexaColor1);

		WebElement button = driver.findElement(By.xpath("//input[@type='button']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();

		WebElement afterClick = driver.findElement(By.xpath("//div[.='This is double click']"));
		String rgbColor2 = afterClick.getCssValue("color");
		System.out.println(rgbColor2);
		String hexaColor2 = Color.fromString(rgbColor2).asHex();
		System.out.println(hexaColor2);

	}

}
