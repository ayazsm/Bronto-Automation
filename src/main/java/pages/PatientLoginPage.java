package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientLoginPage extends BasePage{
    WebDriver driver;
    
    
	public PatientLoginPage(WebDriver driver) {
		
		this.driver=driver;

	}
	
	public void clickLoginAsPatient() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[2]/span[1]")).click();
		//System.out.println("click login as patient");
		log.info("click login as patient ");
	}
	
	public void enterEmailId(String strenterEmailId) {
		driver.findElement(By.name("email")).sendKeys(strenterEmailId);
		//System.out.println("Enter EmailId");
		log.info("Enter EmailId");
	}
	
	public void enterpassword(String strenterpassword1) {
		driver.findElement(By.name("password")).sendKeys(strenterpassword1);
		//System.out.println("Enter password");
		log.info("Enter password");
		
	
	}
	
	public void clickLogin() {
		//System.out.println("Click on login now");
		log.info("Click on login now");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[1]/span[1]")).click();
		log.info("Patient login Test successfull");
	}
	
	public void loginToPatient(String strenterEmailId,String strenterpassword1) {
		
		this.clickLoginAsPatient();
		//Enter the Patient Login EmailID
		this.enterEmailId(strenterEmailId);

		
		//Enter the Patient Login Password
        this.enterpassword(strenterpassword1);
        
        this.clickLogin();
        

	}
	
}

