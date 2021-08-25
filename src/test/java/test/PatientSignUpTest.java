package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.GmailGetOtp;
import pages.PatientSignUpPage;

public class PatientSignUpTest extends BasePage {
	
	PatientSignUpPage objSignUp;
	
	//GmailGetOtp objGmailOtp;
	@Test
	public void SignUpTest() throws IOException 
	{
		
		objSignUp=new PatientSignUpPage(driver);
		objSignUp.signUpToPage(prop.getProperty("name"),prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("mobileno"),prop.getProperty("otp"));
		
//		if(driver.findElement(By.xpath("//*[@id=\"error\"]/div/div/div/div/div[2]/p")).isDisplayed()){ 
//			driver.get("https://www.gmail.com");  
//		//navigate to gmail otherwise you can open in a new tab the same 
//			
//			
//		objGmailOtp=new GmailGetOtp(driver);
//		objGmailOtp.signInToGmail(prop.getProperty("email"));
//		
//		} 
	}

}
