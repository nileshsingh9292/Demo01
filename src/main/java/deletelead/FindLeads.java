package deletelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
@Test
	
	public FindLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}

@FindBy(how=How.ID_OR_NAME,using="id")
	private WebElement eleUserid;
	
	public FindLeads EnterID(String ID) {
		
		type(eleUserid, ID);
		return this;
		
	}

@FindBy(how=How.LINK_TEXT,using="Find Leads")
private WebElement eleFindLeads;
public FindLeads clickLeadsLnk(){
	click(eleFindLeads);
	return this;
}



@FindBy(how=How.XPATH,using="div[@class='//x-grid3-cell-inner x-grid3-col-partyId']/a")
private WebElement eleFirstResultingLead;

public ViewLead FirstLead() {
	
	click(eleFirstResultingLead);
	return new ViewLead(driver,test);
	
}



}
