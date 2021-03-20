package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CashAndBankPage extends BasePage{

	WebDriver driver;
	
	public CashAndBankPage(WebDriver driver) {
		this.driver = driver ;
}
	
	@FindBy(how = How.XPATH, using = "//h2[text()=' Accounts ']")
	WebElement ACCOUNTLANDING;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountName;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement Accountnumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement Submit ;
	
	public void accountlandingPageVerification() {
		Assert.assertEquals("NewACCOUNT FORM NOT OPENED", "Accounts", ACCOUNTLANDING.getText());
	}
	
	public void enterAccountName(String accountName) throws InterruptedException{
		int generateNumber = randomGenerator(999);
		Thread.sleep(3000);
		AccountName.sendKeys(accountName + generateNumber);
	}
	
	
	public void enterDescription(String description) {
		Description.sendKeys(description);
	}
	public void enterInitialBalance(String initialBalance) {
	InitialBalance.sendKeys(initialBalance);
}
	public void enteraccountNumber(String accountNumber) {
		Accountnumber.sendKeys(accountNumber);
	}

	public void entercontactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}

	public void enterphone(String phone) {
		Phone.sendKeys(phone);
	}

	public void submitButton() {
		Submit.click();
	}

	public String getPageTitle(){
		return driver.getTitle();
	}
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		  String label = formatter.format(date);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  String currrentDir = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png"));
		 }
}

