package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase {
	
	WebDriver driver = null;
	Components comp = new Components();
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver","C:/Users/vdv/Downloads/chromedriver_2.33/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.phptravels.com");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void testMethod() throws Exception{

		comp.closePopup(driver);
	}
	
	@AfterTest
	public void closeDriver(){
		driver.quit();
		
	}

}
