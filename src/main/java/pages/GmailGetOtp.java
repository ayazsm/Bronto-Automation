package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailGetOtp extends BasePage{
	
    WebDriver driver;
	
	public GmailGetOtp(WebDriver driver) {
		
		this.driver=driver;
	}
	

	public void gmailSignIn(String strenterEmail1){
		
		driver.findElement(By.name("identifier")).sendKeys(strenterEmail1);
		
	}
	
    public void clickOnNext(){
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
	}
	
	
	public void signInToGmail( String strenterEmail1) {
		
		this.gmailSignIn(strenterEmail1);
		
		this.clickOnNext();
	}
	

}
