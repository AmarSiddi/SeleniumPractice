/**
 * 
 */
package com.wallethub.testcases;

import org.testng.annotations.Test;

import com.wallethub.util.Base;

/**
 * @author Amarnath
 * 
 * This class will execute the Test Cases for Assignment 2
 *
 */
public class WalletHubTestCase extends Base{

	@Test(priority=1)
	public void verifyWalletHubLogin()
	{
		operation.click(walletEle.loginlink);
		assign2.loginWalletHub(walletData.wallethubUserName, walletData.wallethubUserPassword);
	}

	@Test(priority=2)
	public void verifyStarGlowAndClick()
	{
		assign2.starGlow();
		assign2.clickOnStar(walletEle.Star5);  //select star element to click
	}

	@Test(priority=3)
	public static void verifySelectPolicy()
	{
		//pass the Policy to select and select the overall rating star element to click
		assign2.selectPolicyAndRating(walletData.choosePolicy,walletEle.clickOverallRatingStar5);
	}

	@Test(priority=4)
	public void verifyWriteReview()
	{
		assign2.writeReview(walletData.walletHubPostReview,walletEle.clickOverallRatingStar5);
	}
	
	@Test(priority=5)
	public void confirmReview()
	{
		assign2.confirmReviewInProfile();
	}

}
