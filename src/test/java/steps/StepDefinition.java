package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.CashAndBankPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinition {
	WebDriver driver;
	LoginPage loginPage;
    DashboardPage dashboardpage;
    CashAndBankPage CAB;
    
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
				CAB = PageFactory.initElements(driver, CashAndBankPage.class);
	}

	@Given("^User is on the Techfios Page$")
	public void User_is_on_the_Techfios_Page() {
		//driver = BrowserFactory.startBrowser();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String UserName) {
		loginPage.enterUserName(UserName);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws InterruptedException {
		loginPage.enterPassword(password);
		Thread.sleep(2000);
	}

	@When("^User clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);
	}

	@Then("^User should land on Dashboard Page$")
	public void user_should_land_on_Dashboard_Page() throws IOException {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		loginPage.takeScreenshotAtEndOfTest(driver);
	}
	
	@Then ("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws InterruptedException {
	dashboardpage.ClickCashAndBank();
	Thread.sleep(2000);
	}

	 @Then ("^User clicks on new account$")
	public void user_clicks_on_new_account() throws InterruptedException {
	dashboardpage.ClickAddCustomer();
	Thread.sleep(2000);
	 }
	 
	 @When("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	 public void user_fill_up_the_form_entering_and_and_and_and_and(String accountTitle, String description,
				String initialBalance, String accountnumber, String contactPerson, String phone) throws InterruptedException {
	 CAB.enterAccountName(accountTitle);
	 CAB.enterDescription(description);
	 CAB.enterInitialBalance(initialBalance);
	 CAB.enteraccountNumber(accountnumber);
	 CAB.entercontactPerson(contactPerson);
	 CAB.enterphone(phone);
	 
	 Thread.sleep(2000);
	 }
	 
		 @Then("^User click in Submit Button$")
			public void user_click_in_Submit_Button(){
			 CAB.submitButton();
			}
			

			@Then ("^User Should land on Account Page$")
			public void User_Should_land_on_Account_Page () throws IOException, InterruptedException {
				Assert.assertEquals("Accounts- iBilling", CAB.getPageTitle());
				CAB.takeScreenshotAtEndOfTest(driver);
				Thread.sleep(2000);
				
			} 
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
