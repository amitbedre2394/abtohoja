package com.ec.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ec.Utility.Scrolling;
import com.ec.base.BaseClass;

public class IndexPage {
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement rbutton;
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")
	WebElement logo;
	
	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public Boolean verifyTitle() {
		
		Boolean logo2=logo.isDisplayed();
		return logo2;
	}
	public void clickrbutton() {
		rbutton.click();
		
	}
	
	

}
