package com.ictk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ictk.utilities.Pageutils;

public class AddEmpDetails {


	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtName']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmail']")
	private WebElement email;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpDesignation']")
	private WebElement Designation;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpReportingTo']")
	private WebElement reportingTo;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpGroup']")
	private WebElement memberOf;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmployeeId']")
	private WebElement empid;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtConfirmPassword']")
	private WebElement password2;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtMobileNumber']")
	private WebElement phone;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpEmployeeType']")
	private WebElement emptype;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_ChkReportingStaff']")
	private WebElement reportingStaff;
	
	@FindBy(xpath="//textarea[@id='ContentPlaceHolder1_txtAddress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSubmit']")
	private WebElement submit;
	
	
	public AddEmpDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    
    public void Name(String sname) {
        
    	 Pageutils.sendInputdata(Name, sname);
	
    }
    
    public void Password(String strPassword) {


        Pageutils.sendInputdata(password, strPassword);
	
    }
    
    public void Mail(String smail) {


        Pageutils.sendInputdata(email, smail);
	
    }
    
    public void Designation(String sdesignation) {


        Pageutils.sendInputdata(Designation, sdesignation);
	
    }
    
    public void reportingTo(String strreportingTo) {


        Pageutils.sendInputdata(reportingTo, strreportingTo);
	
    }
    
    public void memberOf(String strmemberOf) {


        Pageutils.sendInputdata(memberOf, strmemberOf);
	
    }
    
    public void empId(String strempId) {


        Pageutils.sendInputdata(empid, strempId);
	
    }
    
    public void Password2(String strPassword2) {


        Pageutils.sendInputdata(password2, strPassword2);
	
    }
    
    public void Number(String sphone) {


        Pageutils.sendInputdata(phone, sphone);
	
    }
    
    public void empType(String semptype) {


        Pageutils.sendInputdata(emptype, semptype);
	
    }
    
    public void clickreportingStaff() {
        
		Pageutils.checBoxSelect(reportingStaff);
	        
	}
    
    public void Address(String saddress) {
        
   	 Pageutils.sendInputdata(address, saddress);
	
   }
 
	        
	public void clickLogin() {
	            
		Pageutils.clickButton(driver, submit);
	        
	}
	
}




