package com.app.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.app.base.BaseTest;
import com.app.page.HomePage;
import com.app.page.SearchResultPage;

public class SearchResultTest extends BaseTest{
		SearchResultPage sp;
		HomePage hm;
		
		@BeforeClass
		public void before(){
			  hm =new HomePage(driver);
		      sp=new SearchResultPage(driver);
		}	  
		
		@Test
		public void testresult(){
			Assert.assertEquals("$1,699.00",sp.sortResult());
			}

}