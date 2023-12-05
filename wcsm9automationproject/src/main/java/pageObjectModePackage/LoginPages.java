package pageObjectModePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
	
	// all store webemement of login pages 
	@FindBy(name = "username")private WebElement usnTB;
	@FindBy(name = "pwd")private WebElement passTB;
	@FindBy(id = "loginButton")private WebElement loginbutton;
	@FindBy(name = "remember")private WebElement rememberbox;
	@FindBy(partialLinkText = "Actimind Inc.")private WebElement actiMindLink;
	@FindBy(id = "licenseLink")private WebElement licenseLink;
	
	// right click + source + generate construtor using fields
	
	// intialization
	public LoginPages(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	// utilization right click + source + generate getter  using fields

	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getRememberbox() {
		return rememberbox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	// operational metnods 
	public void validLogin(String validusn,String validpass)
	{
		getUsnTB().sendKeys(validusn);
		getPassTB().sendKeys(validpass);
		getLoginbutton().click();
	}
	public void invalidLogin(String invalidusn,String invalidpass)
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginbutton.click();
		usnTB.clear();
	
		
	}
	
	

}
