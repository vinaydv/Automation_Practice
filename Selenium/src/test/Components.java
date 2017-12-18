package test;

import org.openqa.selenium.WebDriver;

public class Components extends Reusable {
	
	UIMap UIMap = new UIMap();
	
	public void closePopup(WebDriver driver) throws Exception{
		System.out.println("UIMap.close" + UIMap.close);
		clickElement(driver, UIMap.close); 
	}
	
	
	public void Login(WebDriver driver){
		
	}

}
