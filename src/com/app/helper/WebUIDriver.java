package com.app.helper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {
	public static String browserName;
	public static String appUrl;
	
	public static void loadproperties(String filename) throws FileNotFoundException, IOException{
		Properties prop = ConfigUtils.loadproperties(filename);
		browserName =prop.getProperty("browser");
		appUrl = prop.getProperty("appUrl");
	}
    public static WebDriver getDriver(){
	    WebDriver driver=null;
	    switch(browserName){
	case "firefox":
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\geckodriver.exe");
	    driver = new FirefoxDriver();
		break;
	case "chrome":
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\chromedriver.exe");
        driver = new ChromeDriver();
        break;
	case "safari":
		System.setProperty("webdriver.safari.driver","C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\safaridriver.exe");
	    driver = new SafariDriver();
        break;
	case "ie":
		System.setProperty("webdriver.ie.driver","C:\\Users\\ompra\\workspace\\AutomationFramework\\Resources\\internetexplorerdriver.exe");
        driver = new InternetExplorerDriver();
        break;

	case "html":
        driver = new HtmlUnitDriver();
        break;

	default:
        driver = new ChromeDriver();
  	   
}
	return driver;
	
}
}