package test;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.PatientLoginPage;


public class PatientLoginTest extends BasePage{
	
	PatientLoginPage objpatientlogin;
	@Test
	public void loginTest() {
		
		objpatientlogin=new PatientLoginPage(driver);
		
		objpatientlogin.loginToPatient(prop.getProperty("email1"),prop.getProperty("pwd"));

	}

}
