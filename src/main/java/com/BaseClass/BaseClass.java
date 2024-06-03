package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public void getwebDriver() {
		
		WebDriver  driver = new ChromeDriver();
		driver.get(null);
	}

}
