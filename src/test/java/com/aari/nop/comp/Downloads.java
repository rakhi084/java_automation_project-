package com.aari.nop.comp;
import org.openqa.selenium.WebDriver;

import com.aari.nop.util.NopUtil;

public class Downloads {
	private NopUtil util = null;
	
	public Downloads(WebDriver browser) {
		util = new NopUtil(browser);
	}
	
	public void navigate() {
		
		
		util.mouseOverClick("//span[normalize-space()='Downloads']", "//span[normalize-space()='Marketplace']");
		util.mouseOverClick("//span[normalize-space()='Downloads']", "//span[normalize-space()='Translations']");
		util.mouseOverClick("//span[normalize-space()='Downloads']", "//span[normalize-space()='Copyright removal key']");
		util.mouseOverClick("//span[normalize-space()='Downloads']", "//span[normalize-space()='Mobile application']");
		util.mouseOverClick("//span[normalize-space()='Downloads']", "//span[normalize-space()='Web API']");
		
		
		
	}

}
