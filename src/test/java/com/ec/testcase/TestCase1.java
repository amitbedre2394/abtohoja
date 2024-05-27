package com.ec.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ec.Utility.Scrolling;
import com.ec.base.BaseClass;
import com.ec.page.IndexPage;

public class TestCase1 extends BaseClass {
	public IndexPage ip;
	@Test
	public void validateLogo() {
      ip= new IndexPage(driver);
    Boolean logo3= ip.verifyTitle();
    Assert.assertTrue(logo3);
    
    
}
	@Test
	public void validatebutton() {
		ip.clickrbutton();
		Scrolling sc= new Scrolling();
		sc.scroll(driver,0,300);
	}
	
	}
