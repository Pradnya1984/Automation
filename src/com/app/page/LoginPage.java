package com.app.page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import com.app.base.BaseTest;
import com.app.helper.ByClass;

public class LoginPage extends BaseTest{
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String logIn(String uname, String pwd){
		WebElement element = driver.findElement(ByClass.getByobject("css-email"));
		element.clear();
		element.sendKeys(uname);
		element = driver.findElement(ByClass.getByobject("id-pwd"));
		element.clear();
		element.sendKeys(pwd);
		element = driver.findElement(ByClass.getByobject("css-submit"));
		element.click();
		return driver.getTitle();
	}

}
