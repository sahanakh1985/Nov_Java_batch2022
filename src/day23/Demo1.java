package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
//byte short int long --0
//float & double 0.0
//boolean -false
//char =' '
//others--> null
//Page object model (POM)
//Annotation --->@FindBy--Find By Annotation
//in page object model we declare the element using -Find By Annotation
//@FindBy(locator="value")
//<access modifier> WebElement name;

class LoginPage {
	// without initialisation ,if we try to utilise the element then we will get--
	//--"null pointer exception"
	// declaration
	@FindBy(id = "username")
	private WebElement unTB;

	// utilization
	void setUserName() {
		unTB.sendKeys("bhanu");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/skh/login.do");
		LoginPage l = new LoginPage();
		l.setUserName();

	}

}
