package com.app.test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.helper.ExcelHelper;
import com.app.page.HomePage;
import com.app.page.LoginPage;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	HomePage hm;
	
	@BeforeClass
	public void before(){
		  hm =new HomePage(driver);
	      lp=hm.signinClick();
	}	  
	@DataProvider(name="testdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=ExcelHelper.getdata();
		return data;
		
	}
	@Test(dataProvider="testdata")
	public void testlogin(String uname,String pwd){
		Assert.assertNotNull(lp.logIn(uname,pwd));
		}
	

}
