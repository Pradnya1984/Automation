package com.app.test;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.page.HomePage;
import com.app.page.LoginPage;
import com.app.page.RegisterPage;


public class HomePageTest extends BaseTest{
    HomePage hm;

	@BeforeClass
	public void before(){
		  hm =new HomePage(driver);
		     
	}	     
	
     @Test
     public void testNavLink()  {
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	  	 Assert.assertNotNull(hm.headerNavLinks());
         }
     
     @Test
     public void testSearchbox(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	 Assert.assertEquals("Amazon.com: Laptop - Laptops / Computers & Tablets: Electronics", hm.searchBox());
         }
     
     @Test
     public void testsigninClick(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 LoginPage lp = hm.signinClick();
       	 Assert.assertEquals("Amazon Sign In", lp.getTitle());
    	 }
     
     @Test
     public void testnewUser(){
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 RegisterPage rp = hm.newuserRegisterClick();
    	 Assert.assertEquals("Amazon Registration", rp.getTitle());
        }
}
