package day26;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	final int i=2;
	@Test(priority = i)
	public void editUser(){
		Reporter.log("editUser",true);
	}
	@Test(priority = 1)
	public void deleteUser(){
		Reporter.log("deleteUser",true);
	}
	
	@Test(priority = 1)
	public void registerUser(){
		Reporter.log("registerUser",true);
	}

	
	
	
}
