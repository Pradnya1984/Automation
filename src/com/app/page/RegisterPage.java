package com.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.app.base.BaseTest;
import com.app.helper.ByClass;

public class RegisterPage extends BaseTest{
	
	public RegisterPage(WebDriver driver){
		this.driver=driver;
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String register(String name, String email, String password){
		WebElement ele = driver.findElement(ByClass.getByobject("id-regname"));
		ele.sendKeys(name);
	    ele = driver.findElement(ByClass.getByobject("id-regemail"));
		ele.sendKeys(email);
		ele = driver.findElement(ByClass.getByobject("id-regpwd"));
		ele.sendKeys("password");
		ele = driver.findElement(ByClass.getByobject("id-regpwdcheck"));
		ele.sendKeys(password);
		ele=driver.findElement(ByClass.getByobject("id-regsubmit"));
		ele.click();
		return driver.getTitle();
	}
}
