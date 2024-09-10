package com.aari.nop.comp;

import org.openqa.selenium.WebDriver;

import com.aari.nop.util.NopUtil;

public class Support {
	private NopUtil util = null;
	
	public Support(WebDriver browser) {
		util = new NopUtil(browser);
	}
	
	public void navigate() {
		
		
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Training']");
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Documentation']");
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Community forums']");
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Premium support services']");
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Request a quote']");
		util.mouseOverClick("//span[normalize-space()='Support & services']", "//span[normalize-space()='Contact us']");

		
		
	}

}
