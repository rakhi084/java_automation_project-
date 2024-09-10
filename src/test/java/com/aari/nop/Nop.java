package com.aari.nop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aari.nop.comp.Downloads;
import com.aari.nop.comp.Product;
import com.aari.nop.comp.Support;

public class Nop {
	 @Test
		public void launch() {
	    	try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mamid\\eclipse-workspace\\java\\nop\\src\\main\\resources\\chromedriver.exe");
			WebDriver browser = new ChromeDriver(); 
			browser.get("https://www.nopcommerce.com/en");
			browser.manage().window().maximize();
 	        
 	        //Product product = new Product(browser);
 	       // product.navigate();
			//Downloads down = new Downloads(browser);
			//down.navigate();
			Support sup = new Support(browser);
			sup.navigate();
			  
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}	 

	    }
}
