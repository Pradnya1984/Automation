package com.app.page;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.base.BaseTest;
import com.app.helper.ByClass;


public class HomePage extends BaseTest{
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
    public int headerNavLinks(){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> elements = driver.findElements(ByClass.getByobject("css-navLocator"));
		return elements.size();
	}
	
	public String searchBox(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(ByClass.getByobject("css-searchboxLocator"));
		ele.sendKeys("Laptop");
		 ele =driver.findElement(ByClass.getByobject("xpath-searchLocator"));
		   ele.click();
		   System.out.println(driver.getTitle());
		   return driver.getTitle();
		
	}
	public LoginPage signinClick(){
		driver.get("https://www.amazon.com/");
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByobject("css-signinlinkLocator")));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByobject("xpath-signinclickLocator")));
		ele.click();
		return new LoginPage(driver);
		
	}
	
	public RegisterPage newuserRegisterClick(){
		WebDriverWait wait = new WebDriverWait(driver,40);
		WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByobject("css-signinlinkLocator")));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		ele = driver.findElement(ByClass.getByobject("xpath-newuserclickLocator"));
		ele.click();
		return new RegisterPage(driver);
		
	}

}
