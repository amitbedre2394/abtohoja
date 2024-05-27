package com.ec.Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ec.base.BaseClass;

public class Scrolling {
	
	public void scroll(WebDriver driver, int x,int y) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(x,y)");
	}

}
