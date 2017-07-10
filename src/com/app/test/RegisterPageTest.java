package com.app.test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.page.HomePage;
import com.app.page.RegisterPage;
public class RegisterPageTest extends BaseTest{
   RegisterPage rp;
   HomePage hm;
   
   @BeforeClass
	public void before() {
	      hm =new HomePage(driver);
	      rp= hm.newuserRegisterClick();
	      }
          
	@Test
	public void testnewuserregister(){
		Assert.assertNotNull(rp.register("xyz","xyz@gmail.com", "1234"));
		
		}

}
 	
