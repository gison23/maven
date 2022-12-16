package com.ictk.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageutils {

	public static void clickButton(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
    
	public static void sendInputdata(WebElement element,String input)
    {
        element.sendKeys(input);
    }
	
    public static void checBoxSelect(WebElement element) {
		
		if(!element.isSelected())
		{
			element.click();
		}
		
	}
    
    public static void actionmove(WebDriver driver,WebElement element) {
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
    
}


