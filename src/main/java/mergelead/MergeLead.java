package mergelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;


import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {
	@Test
	public MergeLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	public FromLeadPage ClickMergeLnk(RemoteWebDriver driver,ExtentTest test){
		click(eleMergeLeads);
		return new FromLeadPage(driver, test);
	}
	

}
