package day26;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class Demo5 {
	
	@BeforeMethod
	public void openApp() {
		Reporter.log("open the browser",true);
	}
	
	@Test
	public void testLogin()	{
		
		Reporter.log("Enter url",true);
		Reporter.log("Enter un & pwd, click login",true);
		String aT="abc";
		String eT="xyz";
		Assert.assertEquals(aT, eT);//compare+ reporting
		Reporter.log("Waiting....",true);
	}
	
	@AfterMethod
	public void closeApp() {
		Reporter.log("close the browser",true);
	}
	
}
