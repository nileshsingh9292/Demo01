package mergelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;


import wdMethods.ProjectMethods;

public class FromLeadWindow extends ProjectMethods  {
	@Test
	public FromLeadWindow(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(how=How.ID_OR_NAME,using="id")
	private WebElement eleUserid;
	
	public FromLeadWindow EnterID(String ID) {
		
		type(eleUserid, ID);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="id")
	private WebElement eleFindlead;
	
	public FromLeadWindow FindLead() {
		
		click(eleFindlead);
		return this;
		
	}

	@FindBy(how=How.XPATH,using="class")
	private WebElement eleFirstResultingLead;
	
public FromLeadWindow FirstLead() {
		
		click(eleFirstResultingLead);
		return this;
		
	}

public FromLeadPage SwitchFromWindowToMergeScreen(int i)
{
	switchToWindow(i);
	return new FromLeadPage(driver,test);
}

	
	
	
	
}
