/**
 * 
 */
package com.wallethub.util;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.wallethub.modules.FacebookMain;
import com.wallethub.modules.WalletHubMain;
import com.wallethub.testdata.FacebookTestData;
import com.wallethub.testdata.WalletHubTestData;
import com.wallethub.webelements.FacebookWebElements;
import com.wallethub.webelements.WalletHubElements;

/**
 * @author Amarnath
 * 
 * This class initialize all objects used in other class
 * This class should be extended in other classes
 *
 */

public class Base {
	
	protected static Browsers browser;
	protected static FacebookMain assign1;
	protected static WalletHubMain assign2;
	protected static FacebookWebElements faceEle;
	protected static WalletHubElements walletEle;
	protected static DriverOperations operation;
	protected static FacebookTestData faceData;
	protected static WalletHubTestData walletData;
	
	@BeforeClass
	@Parameters({"browserName","url"})
	public static void initialiseObjects(String browserName, String url)
	{
		browser = new Browsers(); 
		Cache.getInsatnce().setDriver(browser.openBrowser(browserName, url));
		assign1 = new FacebookMain();
		assign2 = new WalletHubMain();
		faceEle = new FacebookWebElements();
		walletEle = new WalletHubElements();
		operation = new DriverOperations();
		faceData = new FacebookTestData();
		walletData = new WalletHubTestData();
	}
}