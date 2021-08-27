package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	
	public  WebDriver driver;
	public Properties prop;
	 
	 @BeforeClass
	
	 public void initialize() throws IOException{
		 
	     
		 //Calling config file obj
		 readConfig();
		 System.setProperty("webdriver.chrome.driver","drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 System.out.println("Browser Initialised");

		 
	 //To maximize browser
	            driver.manage().window().maximize();
	            
	 //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	
	 //To open Bronto Application
	            driver.get(prop.getProperty("url"));
	            System.out.println("Navigated to bronto application");
	           
	           
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
	    		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codetru\\eclipselevel\\pom\\screenshots\\screenshot1.png\">Screenshot1</a>");
	    		Reporter.log("<img src=\"C:\\Users\\Codetru\\eclipselevel\\pom\\screenshots\\screenshot1.png\"/>");
	
	
	            
	  //To click Login button            
	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/div/div[4]/div/button/span[1]")).click();
	            System.out.println("Click on login ");
	            
	          
	 
	 }
	 
	 @AfterClass
	 //Test cleanup
	 public void TeardownTest()
	 
	    {
		 
	        driver.quit();
	        //System.out.println("Browser Closed");
	        
	    }
	
	 
	 public void readConfig() {
		 try {
			prop=new Properties();
			FileInputStream fs = new FileInputStream("Configurations\\config.properties"); 
			prop.load(fs);
		} catch (FileNotFoundException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 


}
