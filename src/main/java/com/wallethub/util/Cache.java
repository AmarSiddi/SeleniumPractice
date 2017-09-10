/**
 * 
 */
package com.wallethub.util;

import org.openqa.selenium.WebDriver;

/**
 * @author Amarnath
 *This class will helps to create singleton objects, which can be used in any class
 *here i have created a singleton object of driver. which will be used through out the test
 *
 */
public class Cache {

	private WebDriver driver;
	
	final private static Cache instance = new Cache();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public static Cache getInsatnce()
	{
		return instance;
	}
	
	
}
