package com.aari.nop.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NopUtil {
	
private WebDriver browser = null;
	
	public NopUtil(WebDriver browser) {
		this.browser = browser;
	}
	
	public void click(String xPath) {
		browser.findElement(By.xpath(xPath)).click();
	}
	
	public void mouseOverClick(String mxPath, String xPath) {
		WebElement ele = browser.findElement(By.xpath(mxPath));

		//Creating object of an Actions class
		Actions action = new Actions(browser);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
		click(xPath);
	}
	
	public void mouseHoverandHoverClick(String mxPath, String mmxPath, String xPath) {
		WebElement ele = browser.findElement(By.xpath(mxPath));

		//Creating object of an Actions class
		Actions action = new Actions(browser);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
		mouseOverClick(mmxPath, xPath);
	}
	public void mouseHoverandHoveragainclick(String mxPath,String mmxPath,String xPath) {
		WebElement ele = browser.findElement(By.xpath(mxPath));

		//Creating object of an Actions class
		Actions action = new Actions(browser);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		mouseHoverandHoverClick( mxPath,mmxPath,xPath);
		
		
		
	}

}
