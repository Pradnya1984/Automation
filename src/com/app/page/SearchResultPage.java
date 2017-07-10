package com.app.page;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.base.BaseTest;
import com.app.helper.ByClass;

public class SearchResultPage extends BaseTest{
	
	public SearchResultPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public String sortResult(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele =driver.findElement(ByClass.getByobject("css-searchboxLocator"));
		ele.sendKeys("Apple phone 7 plus unlocked");
		ele=driver.findElement(ByClass.getByobject("xpath-searchLocator"));
		ele.click();
		ele=driver.findElement(ByClass.getByobject("css-sort"));
		WebElement select=driver.findElement(ByClass.getByobject("xpath-select"));
		select.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		List<WebElement> prod =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ByClass.getByobject("css-pricesort")));
		prod.get(0).click();		
		String price=driver.findElement(ByClass.getByobject("css-price")).getText();
		return price;
		       
	}
}
