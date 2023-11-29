package pageObjectModePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	
	// store all the web element in tasks page 
	//@FindBy(xpath = "//a[text()='Archives']")private WebElement Archives;
	//@FindBy(xpath = "//a[text()='Open Tasks']")private WebElement OpenTasks;
	//@FindBy(xpath = "//a[text()='Completed Tasks']")private WebElement CompletedTasks;
	@FindBy(xpath = "//a[text()='Projects & Customers']")private WebElement Projects_Customers_Sub_Mod;
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement Create_New_Project_Button;
	@FindBy(xpath = "//input[@name='name']")private WebElement Customer_NameTB;
	@FindBy(xpath = "//textarea[@name='description']")private WebElement Description;
	@FindBy(xpath = "//input[@name='createCustomerSubmit']")private WebElement Create_Customer_Button;
	@FindBy(xpath = "//select[@name='customerId']")private WebElement Customer_Name_Dropdown;
	@FindBy(xpath = "//input[@name='name']")private WebElement ProjectName;
	@FindBy(xpath = "//input[@name='createProjectSubmit']")private WebElement CreateProjectButton;
	
	// initialization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// utilization
	
	public WebElement getProjects_Customers_Sub_Mod() {
		return Projects_Customers_Sub_Mod;
	}
	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}
	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}
	public WebElement getCustomer_NameTB() {
		return Customer_NameTB;
	}
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getCreate_Customer_Submit() {
		return Create_Customer_Button;
	}
	public WebElement getCustomer_Name_Dropdown() {
		return Customer_Name_Dropdown;
	}
	public WebElement getName() {
		return ProjectName;
	}
	public WebElement getCreateProjectSubmit() {
		return CreateProjectButton;
	}
	/*public WebElement getCompletedTasks() {
		return CompletedTasks;
	}
	public WebElement getArchives() {
		return Archives;
	}
	public WebElement getOpenTasks() {
		return OpenTasks;
	}
	 
	 */
	// operational methods
	public void createcustomer_createproject_method(String cust_name,String desc ,String pro_name) throws InterruptedException
	{
		Projects_Customers_Sub_Mod.click();
		Thread.sleep(2000);
		Create_New_Customer_Button.click();
		Thread.sleep(2000);
		Customer_NameTB.sendKeys(cust_name);
		Thread.sleep(2000);
		Description.sendKeys(desc);
		Thread.sleep(2000);
		Create_Customer_Button.click();
		Thread.sleep(2000);
		Create_New_Project_Button.click();
		Thread.sleep(2000);
		Select rk = new Select(Customer_Name_Dropdown);
		rk.selectByVisibleText(cust_name);
		
		ProjectName.sendKeys(pro_name);
		Thread.sleep(2000);
		CreateProjectButton.click();
			
		
	}
	
}
