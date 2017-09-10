/**
 * 
 */
package com.wallethub.webelements;

import org.openqa.selenium.By;

/**
 * @author Amarnath
 * 
 * This Class has all the Web Elements required for Wallet Hub operations
 *
 */
public class WalletHubElements {

	public By loginlink=By.xpath("//*[@class='login']");
	public By username=By.xpath("//*[@name='em']");
	public By password=By.xpath("//*[@name='pw']");
	public By loginButton=By.xpath("//*[@id='join-login']/form/div[5]/button[2]");
	
	public By clickPopUp=By.xpath("//*[@id='footer_cta']/span/span/i[2]");
	//*[@id="footer_cta" or @class='cta_arrow down' or @class='af-icon-cross']/span
	
	public By selectStar=By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/span[@class='wh-rating rating_5' or text()='Rating: ']");
	//*[@id='wh-body-inner']/div[2]/div[3]/span
	
	public By Star1=By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[1]");
	public By Star2=By.xpath("//*[@class = 'wh-rating-choices-holder']/a[2]");
	public By Star3=By.xpath("//*[@class = 'wh-rating-choices-holder']/a[3]");
	public By Star4=By.xpath("//*[@class = 'wh-rating-choices-holder']/a[4]");
	
	public By Star5=By.xpath("//*[@class='wh-rating-choices' or @class='wh-rating-choices-holder']/a[5]");
	//*[@class = 'wh-rating-choices-holder']/a[5]
	
	public By clickSelectPolicy=By.xpath("//*[text()='Please select your policy']");
	public By selectPolicy=By.xpath("//*[@id='reviewform']/div[1]/div/ul/li");
		
	public By clickOverallRatingStar1=By.xpath("//*[@id='overallRating']/a[1]");
	public By clickOverallRatingStar2=By.xpath("//*[@id='overallRating']/a[2]");
	public By clickOverallRatingStar3=By.xpath("//*[@id='overallRating']/a[3]");
	public By clickOverallRatingStar4=By.xpath("//*[@id='overallRating']/a[4]");
	public By clickOverallRatingStar5=By.xpath("//*[@id='overallRating']/a[5]");
		
	public By writeReview=By.xpath("//*[@id='review-content']");
	public By submitReview= By.xpath("//*[@id='reviewform']/div[3]/div[2]/input");
	public By reviewConfirmationText=By.xpath("//*[@id='review']/div[1]/h1");
	
	public By selectUserName=By.xpath("//a[@class='user' and @data-menu='m-user']"); 
	public By clickOnProfile=  By.xpath("//a[text()='Profile']");
	public By clickOnReview= By.xpath("//a[contains(.,'Reviews')]"); 
	
    public By postedReviewText=By.xpath("//*[@class='reviews']/div[1]/p");
}