package com.app.base;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.app.helper.ByClass;
import com.app.helper.WebUIDriver;

public class BaseTest {
   protected WebDriver driver;
	@BeforeSuite
	public void beforesuite() throws FileNotFoundException, IOException{
		try {
			WebUIDriver.loadproperties("config.properties");
			  } catch (IOException e) {
			 e.printStackTrace();
		 }
	    		
	     driver = WebUIDriver.getDriver();
	     driver.get(WebUIDriver.appUrl);
	     ByClass.loadproperties();
	}
	@AfterSuite
	 public void aftersuite(){
		 driver.close();

	  }
}
