package test;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Reusable {
	
	public  WebDriver driver;

	public  WebDriverWait wait;
	
	public  void clickElement(WebDriver driver,By element) throws Exception{
		
		WebElement webElement = null;
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		webElement.click();
		
	}
	
	
	

}
