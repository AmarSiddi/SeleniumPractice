package com.wallethub.modules;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.wallethub.util.Base;

/**
 * @author Amarnath
 * 
 * This class implements the operations of walletHub application
 *
 */
public class WalletHubMain extends Base{

	public void loginWalletHub(String username, String password)
	{
		operation.input(walletEle.username, username);
		operation.input(walletEle.password, password);
		operation.click(walletEle.loginButton);
		
		Reporter.log("successfully sing into the user account", true);
	}

	public void starGlow()
	{
		try {
			operation.click(walletEle.clickPopUp);  //here application wait till pop get disappear, because it will render the web elements
			Thread.sleep(1000);
			operation.mouseHover(walletEle.selectStar);
			operation.mouseHover(walletEle.Star1);
			operation.mouseHover(walletEle.Star2);
			operation.mouseHover(walletEle.Star3);
			operation.mouseHover(walletEle.Star4);
			operation.mouseHover(walletEle.Star5);	

			Assert.assertEquals(operation.verifyElementState(walletEle.Star1), walletData.starGlowTrue);
			Assert.assertEquals(operation.verifyElementState(walletEle.Star2), walletData.starGlowTrue);
			Assert.assertEquals(operation.verifyElementState(walletEle.Star3), walletData.starGlowTrue);
			Assert.assertEquals(operation.verifyElementState(walletEle.Star4), walletData.starGlowTrue);
			Assert.assertEquals(operation.verifyElementState(walletEle.Star5), walletData.starGlowTrue);
			
			Reporter.log("assertion has been passed, hence it confirms all star has been glown", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnStar(By selectStar)
	{
		try
		{
			Thread.sleep(1000);
			operation.click(selectStar);
			Reporter.log("clicked on the star", true);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public void selectPolicyAndRating(String selectPolicy, By ratingStar)
	{

		try {
			operation.click(walletEle.clickSelectPolicy);
			operation.selectDropDown(walletEle.selectPolicy,selectPolicy);
			Reporter.log(selectPolicy+" policy has been selected", true);

			Thread.sleep(1000);
			operation.mouseHover(walletEle.clickOverallRatingStar1);
			operation.mouseHover(walletEle.clickOverallRatingStar2);
			operation.mouseHover(walletEle.clickOverallRatingStar3);
			operation.mouseHover(walletEle.clickOverallRatingStar4);
			operation.mouseHover(walletEle.clickOverallRatingStar5);
			
			Thread.sleep(1000);
			operation.click(ratingStar);
			Assert.assertEquals(operation.verifyElementState(ratingStar), walletData.starGlowTrue);
			Reporter.log("overall rating has been done", true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void writeReview(String postReview,By ratingStar )
	{
		try 
		{
			Thread.sleep(1000);
			operation.input(walletEle.writeReview, postReview);
			operation.click(walletEle.submitReview);

			Assert.assertEquals(operation.getText(walletEle.reviewConfirmationText), 
					walletData.expectedConfirmMessage);
		} 
		catch (Exception e) 
		{
		/*
		 * if the overall rating is not selected then this will handle the Alert and 
		 * rate it again and submit the review
		 *
		 */
			operation.handlePopUp();
			operation.click(ratingStar);
			Assert.assertEquals(operation.verifyElementState(ratingStar), walletData.starGlowTrue);
			Reporter.log("overall rating has been done", true);
			operation.click(walletEle.submitReview);
		}
	}

	public void confirmReviewInProfile()
	{
		try {
			operation.mouseHover(walletEle.selectUserName);
			operation.click(walletEle.clickOnProfile);
			Thread.sleep(1000);
			operation.mouseHover(walletEle.clickOnReview);
			operation.tabclick(walletEle.clickOnReview);
			Thread.sleep(1000);
			Assert.assertTrue(true, operation.getText(walletEle.postedReviewText));
			Reporter.log("Review Text has been confirmed", true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
