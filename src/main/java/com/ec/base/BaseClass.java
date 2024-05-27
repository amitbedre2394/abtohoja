package com.ec.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
@BeforeSuite
public void init() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Downloads\\chromedriver-win64 (12)\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	
	
}

}
