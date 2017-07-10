package com.app.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	public static Properties loadproperties(String filename) throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\config.properties"));
		return prop;
	}
	public static Properties loadproperties1(String filename) throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\Locators\\locators.properties"));
		return prop;
	}
}
