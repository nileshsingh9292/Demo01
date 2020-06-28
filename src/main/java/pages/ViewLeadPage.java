package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	@Test
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
 
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewFirstname	;
	public void VerifyFirstName(String expectedText){
		
		verifyExactText(eleViewFirstname,expectedText);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
