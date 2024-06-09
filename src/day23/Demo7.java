package day23;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//example to show how to handle multiple elements (findElements) using POM class
class Google {
	@FindBy(xpath = "//a")
	private WebElement link; // WebElement link=driver.findElement(By.xpath("//a"));

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks; // List<WebElement> allLinks=driver.findElements(By.xpath("//a"));

	Google(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	void countLink() {
		int count = allLinks.size();
		System.out.println(count);
	}

	void printAllLinks() {
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}

	}
}

public class Demo7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Google g = new Google(driver);
		g.countLink();
		g.printAllLinks();
		driver.quit();

	}

}
