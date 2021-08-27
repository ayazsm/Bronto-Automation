package test;
import java.io.IOException;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PatientSignUpPage;

public class PatientSignUpTest extends BasePage {
	
	PatientSignUpPage objSignUp;
	
	@Test
	public void SignUpTest() throws IOException 
	{
		
		objSignUp=new PatientSignUpPage(driver);
		objSignUp.signUpToPage(prop.getProperty("name"),prop.getProperty("email"),prop.getProperty("password"),prop.getProperty("mobileno"),prop.getProperty("otp"));
		

	}

}
