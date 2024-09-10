package com.aari.nop.comp;

import org.openqa.selenium.WebDriver;

import com.aari.nop.util.NopUtil;

public class Product {
	private NopUtil util = null;
	
	public Product(WebDriver browser) {
		util = new NopUtil(browser);
	}
	
	public void navigate() {
		util.mouseOverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Store demo']");
		util.mouseOverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Showcase']");
		util.mouseOverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Features']");
		util.mouseOverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Why for developers']");
		util.mouseOverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Why for store owners']");

		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='Fashion']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='Health & Beauty']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='Food & Beverage']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='Automotive']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='Furniture']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='B2B eCommerce']");
		util.mouseHoverandHoverClick("//span[normalize-space()='Product']", "//span[normalize-space()='Industries']", "//span[normalize-space()='International']");
		
		
		
		
		
	}

}
