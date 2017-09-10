/**
 * 
 */
package com.wallethub.webelements;

import org.openqa.selenium.By;

/**
 * @author Amarnath
 *
 *This class has the Web Elements required for the face book assignments
 *
 */

public class FacebookWebElements {
	
	public By username=By.xpath("//*[@id='email']");
	public By password=By.xpath("//*[@id='pass']");
	public By loginButton=By.xpath("//input[@id='u_0_2']"); 
	public By verifyUserName=By.xpath("//*[@id='u_0_a']/div[1]/div[1]/div/a/span");
	
	public By postBox=By.xpath("//*[@name='xhpc_message']");
	public By postButton=By.xpath("//*[text()='Post']");
}
