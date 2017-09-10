/**
 * 
 */
package com.wallethub.modules;

import com.wallethub.util.Base;

/**
 * @author Amarnath
 *
 *This class has the functionality to perform facebook operations
 */
public class FacebookMain extends Base{

	public void facebookLogin(String username, String password)
	{
		operation.input(faceEle.username, username);
		operation.input(faceEle.password, password);
		operation.click(faceEle.loginButton);
	}
	
	public void postFacebookStatus(String post)
	{
		operation.input(faceEle.postBox, post);
		operation.click(faceEle.postButton);
	}
}
