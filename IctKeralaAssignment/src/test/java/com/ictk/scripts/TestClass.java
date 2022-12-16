package com.ictk.scripts;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ictk.base.Base;
import com.ictk.constants.AutomationConstants;
import com.ictk.pages.AddEmpDetails;
import com.ictk.pages.Employeeadd;
import com.ictk.pages.Loginpage;
import com.ictk.utilities.ExcelUtility;
import com.ictk.utilities.ExcelUtility2;


public class TestClass extends Base{
	
	
	Loginpage log;
	Employeeadd empAdd;
	AddEmpDetails AddDetail;
	
	
	@Test(priority=0)
	  public void ValidLoginVerification() throws Exception 
	{
	      
		  log=new Loginpage(getDriver());
	      
	      String actualusername=ExcelUtility.getCellData(0, 11).getStringCellValue();
	      log.susername(actualusername);
	      Assert.assertEquals(AutomationConstants.exptUsername, actualusername);
	     
	      
	      String actualpassword=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 12).getNumericCellValue());
	      log.sPassword(actualpassword);
	      Assert.assertEquals(AutomationConstants.exptPassword, actualpassword);
	
          log.clickLogin();
          
          String actualvalue=getDriver().getTitle();
          Assert.assertEquals(AutomationConstants.ExpectedValue,actualvalue);
          System.out.println(actualvalue);

	  }
	
	@Test(priority=1)
	  public void ValidHomeVerification() throws Exception
	{
		empAdd=new Employeeadd(getDriver());
		empAdd.addEmployee();
	}
	
	  
	  @Test(priority=2)
	  public void ValidAddEmpVerification() throws Exception {
	      
		  AddDetail=new AddEmpDetails(getDriver());
	      
	      String actualname=ExcelUtility2.getCellData(0, 0);
	      AddDetail.Name(actualname);
	      Assert.assertEquals(AutomationConstants.expname, actualname);
	      
	      String actualpassword=ExcelUtility2.getCellData(0, 1);
	      AddDetail.Password(actualpassword);
	      Assert.assertEquals(AutomationConstants.exppassword, actualpassword);
	      
	      String actualemail=ExcelUtility2.getCellData(0, 2);
	      AddDetail.Mail(actualemail);
	      Assert.assertEquals(AutomationConstants.expemail, actualemail);
	      
	      String actualdesignation=ExcelUtility2.getCellData(0, 3);
	      AddDetail.Designation(actualdesignation);
	      Assert.assertEquals(AutomationConstants.expdesignation, actualdesignation);
	      
	      String actualreportingTo=ExcelUtility2.getCellData(0, 4);
	      AddDetail.reportingTo(actualreportingTo);
	      Assert.assertEquals(AutomationConstants.expreportingto, actualreportingTo);
	      
	      String actualmemberOf=ExcelUtility2.getCellData(0, 5);
	      AddDetail.memberOf(actualmemberOf);
	      Assert.assertEquals(AutomationConstants.expmemberof, actualmemberOf);
	      
	      String actualempId=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 6).getNumericCellValue());
	      AddDetail.empId(actualempId);
	      Assert.assertEquals(AutomationConstants.expempid, actualempId);
	      
	      String actualpassword2=ExcelUtility2.getCellData(0, 7);
	      AddDetail.Password2(actualpassword2);
	      Assert.assertEquals(AutomationConstants.exppassword2, actualpassword2);
	      
	      String actualnumber=NumberToTextConverter.toText(ExcelUtility.getCellData(0, 8).getNumericCellValue());
	      AddDetail.Number(actualnumber);
	      Assert.assertEquals(AutomationConstants.expnumber, actualnumber);
	      
	      String actualtype=ExcelUtility2.getCellData(0, 9);
	      AddDetail.empType(actualtype);
	      Assert.assertEquals(AutomationConstants.exptype, actualtype);
	      
	      AddDetail.clickreportingStaff();
	      
	      String actualaddress=ExcelUtility2.getCellData(0, 10);
	      AddDetail.Address(actualaddress);
	      Assert.assertEquals(AutomationConstants.expaddress, actualaddress);
	      
	      
          AddDetail.clickLogin();
          
	  }
	 
	  
	  
	  @Test(priority=3)
	  public void logout()
	  {
		  
		  empAdd=new Employeeadd(getDriver());
		  empAdd.homeClick();
		  empAdd.listEmployee();
	  }  
	  
}



