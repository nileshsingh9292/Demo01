package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mergelead.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods {

	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_MergeLead";
		testDescription = "Merge lead";
		category= "Smoke";
	     authors	="rag";
		browserName ="chrome";
		
	}
	
@Test(dataProvider="fetchData")
	public void MegLead(String Username, String Password,String ID1,String ID2) {
		
		new LoginPage(driver, test)
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFALnk(driver, test)
		.clickLeadsLnk(driver, test)
		.ClickMergeLnk(driver, test)
		.ClickFromWindow()
		.SwitchFromWindow(1)
		.EnterID(ID1)
		.FindLead()
		.FirstLead()
		.SwitchFromWindowToMergeScreen(0)
		.ClickToWindow()
		.SwitchToWindow(1)
		.EnterID(ID2)
		.FindLead()
		.FirstLead()
		.SwitchToWindowToMergeScreen(0)
		.ClickMergeButton();
		
		
		
		
		
		
		//.clickLogout();
		
		
		
		
		
		
		
	}


}
