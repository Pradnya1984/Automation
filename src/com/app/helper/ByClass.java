package com.app.helper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ByClass {
	static Properties prop;
	public static void loadproperties(){
		try {
			prop = ConfigUtils.loadproperties1("\\Locators\\locators.properties");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			
	public static By getByobject(String key){
		By by = null;
		
		if(key.startsWith("css")){
			   return By.cssSelector(prop.getProperty(key));
		   }else if(key.startsWith("xpath")){
			   return By.xpath(prop.getProperty(key));
		   }else if(key.startsWith("id")){
			   return By.id(prop.getProperty(key));
		   }else if(key.startsWith("class")){
			   return By.className(prop.getProperty(key));
		   }else if(key.startsWith("name")){
			   return By.name(prop.getProperty(key));
		   }else if(key.startsWith("linktext")){
			   return By.linkText(prop.getProperty(key));
		   }else if(key.startsWith("partiallink")){
			   return By.partialLinkText(prop.getProperty(key));
		   }else if(key.startsWith("tagname")){
			   return By.tagName(prop.getProperty(key));
		   }
			return by;
		}      
   }
