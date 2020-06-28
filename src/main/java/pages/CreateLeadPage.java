package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	@Test
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage enterComapanyName(String CName) {
		type(eleCompanyName, CName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String fname ) {
		type(eleFirstName, fname);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName, lName);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	public ViewLeadPage clickCreateLeadBtn() {
		click(eleCreateLeadSubmit);
		return new ViewLeadPage(driver, test);
	}
	
	
		

	

}
