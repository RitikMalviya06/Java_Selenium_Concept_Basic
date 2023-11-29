package pageObjectModePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// store all the modules of home pages
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img")private WebElement TimeTrack;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::img")private WebElement Tasks;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::img")private WebElement Reports;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::img")private WebElement Users;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img")private WebElement WorkSchedule;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::img")private WebElement Settings;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement Logout;
	
	// initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// utilization

	public WebElement getTimeTrack() {
		return TimeTrack;
	}

	public WebElement getTasks() {
		return Tasks;
	}

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getUsers() {
		return Users;
	}

	public WebElement getWorkSchedule() {
		return WorkSchedule;
	}

	public WebElement getSettings() {
		return Settings;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	// operational methods 
	public void click_on_TimeTrack()
	{
		TimeTrack.click();
	}
	public void click_on_Tasks()
	{
		Tasks.click();
	}
	
	public void click_on_Reports()
	{
		Reports.click();
	}
	
	public void click_on_Users()
	{
		Users.click();
	}
	
	public void click_on_WorkSchedule()
	{
		WorkSchedule.click();
	}
	public void click_on_Settings()
	{
		Settings.click();
	}
	public void click_on_Logout()
	{
		Logout.click();
		
	}
	
	
	

}
