package com.wallethub.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Amarnath
 * 
 * In this i have implemented the functionality to perform operations on the Web Application
 * you can use these functionality for other application also.
 *
 */
public class DriverOperations extends Base
{
	WebDriver driver;

	public DriverOperations(){
		this.driver=Cache.getInsatnce().getDriver();
	}

	public void click(By clickEle){
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(clickEle).click();
		}
		catch (Exception e){
			WebDriverWait wait=new WebDriverWait(driver, 30);
			WebElement click=driver.findElement(clickEle);
			wait.until(ExpectedConditions.visibilityOfElementLocated(clickEle));
			click.click();
		}
	}
	
	public void tabclick(By clickEle)
	{
		driver.findElement(clickEle).click();
	}

	public void input(By inputEle, String  inputData ){

		try{
			driver.findElement(inputEle).sendKeys(inputData);
		}
		catch (Exception e){
			WebDriverWait wait=new WebDriverWait(driver, 30);
			WebElement input=driver.findElement(inputEle);
			wait.until(ExpectedConditions.visibilityOfElementLocated(inputEle));
			input.sendKeys(inputData);
		}
	}  

	public void selectDropDown(By selectEle, String selectData ){
				
		List<WebElement> selectElement=driver.findElements(selectEle);
		
		for(WebElement select:selectElement)
		{
			if( select.getText().equalsIgnoreCase(selectData))
				select.click();	
		}		
	}
	
	public String getText(By textEle)
	{
		return driver.findElement(textEle).getText();
	}
	
	public void mouseHover(By mouseEle)
	{
		Actions mousehover = new Actions(driver);
		WebElement mouse=driver.findElement(mouseEle);
		mousehover.moveToElement(mouse).perform();
	}
	
	public boolean verifyElementState(By actualEleState )
	{
		boolean starglow = driver.findElement(actualEleState).isEnabled();
		return starglow;
	}
	
	public void handlePopUp()
	{
		driver.switchTo().alert().accept();
	}
}
