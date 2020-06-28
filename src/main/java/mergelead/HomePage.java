package mergelead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	@Test

	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRMSFA;
	public MyHomePage clickCRMSFALnk(RemoteWebDriver driver,ExtentTest test){
		click(eleCRMSFA);
		return new MyHomePage(driver, test);
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, test);
	}

















}
