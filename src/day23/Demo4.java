package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//In POM - how do we declare element -using Find By Annotation
//in POM - how do we initialize the element--> using initElements method of PageFactory class
//How many arg and what are those - 2 WebDriver (browser) POM class Object 
class LoginPage3 {
	// declaration
	@FindBy(id = "username")
	private WebElement unTB;

	// initialization
	LoginPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	void setUserName() {
		unTB.sendKeys("sahana");
	}
}

public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		LoginPage3 loginPageObj = new LoginPage3(driver);

		loginPageObj.setUserName();

	}

}
