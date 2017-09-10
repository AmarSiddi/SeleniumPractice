/**
 * 
 */
package com.wallethub.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wallethub.util.Base;

/**
 * @author Amarnath
 * 
 * This class will execute the test cases for Assignment 1
 *
 */
public class FacebbokTestCase extends Base{
	
	@Test(priority=1)
	public void verifyFacebookLogin()
	{
		assign1.facebookLogin(faceData.facebookUserName, faceData.facebookPassword );
		Assert.assertTrue(true, operation.getText(faceEle.verifyUserName));
	}
	
	@Test(priority=2)
	public static void verifyFacebookPost()
	{
		assign1.postFacebookStatus(faceData.postMessage);
	}
}