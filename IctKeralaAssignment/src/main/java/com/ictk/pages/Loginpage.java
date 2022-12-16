package com.ictk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ictk.utilities.Pageutils;


public class Loginpage {

	WebDriver driver;

	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	private WebElement login;
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

    
    public void susername(String use) {
        
    	 Pageutils.sendInputdata(username, use);
	
    }
    
    public void sPassword(String pass) {


        Pageutils.sendInputdata(password, pass);
	
    }
  
	        
	public void clickLogin() {
	            
		Pageutils.clickButton(driver, login);
		
	        
	}
	
}