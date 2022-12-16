package com.ictk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ictk.utilities.Pageutils;

public class Employeeadd {


WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement Employee;
	
	@FindBy(linkText="Add Employee")
	private WebElement AddEmployee;
	
	@FindBy(linkText="List Employee")
	private WebElement ListEmployee;
	
	@FindBy(linkText="Home")
	private WebElement home;
	
	@FindBy(linkText="Logout")
	private WebElement Logout;

	public Employeeadd(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void addEmployee(){
	    	
	    	Pageutils.actionmove(driver, Employee);
	    	Pageutils.clickButton(driver, AddEmployee);
		
		}
	 public void listEmployee(){
	    	
		 Pageutils.actionmove(driver, Employee);
	    Pageutils.clickButton(driver, ListEmployee);
		
		}
	 
	 public void homeClick() 
	 {
		 Pageutils.clickButton(driver, home);
	 }
	 
 
	
}

