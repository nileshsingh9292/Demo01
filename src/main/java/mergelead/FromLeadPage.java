package mergelead;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FromLeadPage extends ProjectMethods {
	
	@Test
	public FromLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	private WebElement eleToFirstWindow;
	
	
	public FromLeadPage ClickFromWindow()
	{
		click(eleToFirstWindow);
		return this;
	}
	
	public FromLeadWindow SwitchFromWindow(int i)
	{
		switchToWindow(i);
		return new FromLeadWindow(driver,test);
	}
	
	
	@FindBy(how=How.XPATH,using="img[@alt='Lookup'])[2]")
	private WebElement eleToSecondWindow;
	
	
	public FromLeadPage ClickToWindow()
	{
		click(eleToSecondWindow);
		return this;
	}
	
	
	public ToLeadWindow SwitchToWindow(int i)
	{
		switchToWindow(i);
		return new ToLeadWindow(driver,test);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleClickMerge;
	
	
	public FromLeadPage ClickMergeButton()
	{
		click(eleClickMerge);
		return this;
	}
	
	
	
	
	
	
	
	
	
}
