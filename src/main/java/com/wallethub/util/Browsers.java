/**
 * 
 */
package com.wallethub.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

/**
 * @author Amarnath
 * 
 * this class will initialize the driver based on the requirent call
 *
 */

public class Browsers extends Base {

	public WebDriver openBrowser(String browserName, String url)
	{
		WebDriver driver=null;

		if(driver==null)
		{
			if(browserName.equals("firefox"))
			{
				FirefoxDriverManager.getInstance().setup();
				driver = new FirefoxDriver();
			}
			else if (browserName.equals("chrome"))
			{
				ChromeDriverManager.getInstance().setup();
				driver = new ChromeDriver();
			}
			//we can also specify other browsers in same manner
		}
		driver.get(url);
		return driver;
	}
}
