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

public class DashboardPage extends BasePage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Dashboard']")
	WebElement HOMEPAGE;
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement CashAndBank;
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	WebElement AddCustomer;

	public void homePagelandingVerification() {
		System.out.println(HOMEPAGE.getText());
		Assert.assertEquals("LandingPAGE NOT FOUND", "Dashboard", HOMEPAGE.getText());
	}

	public void ClickCashAndBank() {
		waitForElement(driver, 5, CashAndBank);
		CashAndBank.click();
	}

	public void ClickAddCustomer() {
		waitForElement(driver, 5, AddCustomer);
		AddCustomer.click();

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
