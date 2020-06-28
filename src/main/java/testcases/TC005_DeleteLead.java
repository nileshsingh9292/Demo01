package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import deletelead.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {

	dataSheetName = "TC005";
	testCaseName = "TC005_DeleteLead";
	testDescription = "To delete a lead";
	category= "Smoke";
	authors	="Nilesh";
	browserName ="chrome";
	
	
}
	
	@Test(dataProvider="fetchData")
	public void loginFail(String userName, String passWord, String errorMsg,String ID1) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFALnk(driver, test)
		.clickLeadsLnk(driver, test)
	    .EnterID(ID1)
		.clickLeadsLnk()
		.FirstLead()
		.clickdeleteLnk();
	
	
	
	
}

