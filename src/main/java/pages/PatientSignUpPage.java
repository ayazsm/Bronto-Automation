package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class PatientSignUpPage extends BasePage
{
	
	WebDriver driver;
	
	public PatientSignUpPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void loginAsPatient(){

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[2]/span[1]")).click();
		System.out.println("click on login as patient");
	}
	
	public void signUpnowButton(){

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[4]/div/div/div/p[2]")).click();
		System.out.println("click on signup now button");
	}
	
	//Enter With  name
	public void enterName(String strenterName){

		driver.findElement(By.name("name")).sendKeys(strenterName);
		System.out.println("Enter name");
	}
	//Enter With email
	public void enterEmail(String strenterEmail){

		driver.findElement(By.name("email")).sendKeys(strenterEmail);
		System.out.println("Enter email");
	}
	//Enter Password
	public void enterPassword(String strenterPassword) {
			
		driver.findElement(By.name("password")).sendKeys(strenterPassword);
		System.out.println("Enter password");
		
	}
	
	//Enter With  Mobile No
	public void enterMobileNo(String strenterMobileNo){

		driver.findElement(By.name("mobile")).sendKeys(strenterMobileNo);
		System.out.println("Enter mobile no");
	}
	
	//click on verify button
	public void clickOnLogin() throws IOException {
		System.out.println("Click on verify ");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/div[4]/div[2]/button/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
			
	}
	
	//Enter With  Mobile No
	public void enterOTP(String strenterOTP){

		driver.findElement(By.name("otp")).sendKeys(strenterOTP);
		System.out.println("Enter OTP");
	}
	
	public void clickOnSignUp() {
		
		System.out.println("Click on Signup now");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[1]/span[1]")).click();
		
	}
	
	
	public void signUpToPage(String strenterName,String strenterEmail,String strenterPassword,String strenterMobileNo,String strenterOTP) throws IOException{
		
		this.loginAsPatient();
		
		this.signUpnowButton();

        this.enterName(strenterName);
            
        this.enterEmail(strenterEmail);

        this.enterPassword(strenterPassword);

        this.enterMobileNo(strenterMobileNo);

        this.clickOnLogin();
        
        this.enterOTP(strenterOTP);
        
        this.clickOnSignUp();
        
        
        
    }	

	
	

}
