package testJavaFiles;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActionsClass.ActionsPageActions;
import PageActionsClass.AlertPageActions;
import PageActionsClass.ColorLoadingPageActions;
import PageActionsClass.HomePageActions;
import PageActionsClass.PoPageActions;
import SampleRun.base;

public class TestRun extends base {
	
	WebDriver driver;
	
	HomePageActions homePage = null;
	ActionsPageActions actionPage = null;
	AlertPageActions alertpg = null;
	PoPageActions pPage = null;
	ColorLoadingPageActions clPage = null;
	public TestRun()
	{
		super();
	}
	
	@BeforeTest
	public void firstSetUp()
	{
		driver = intialization();
		
	}
	
	
	
	@Test
	public void verifyPageTitle() throws InterruptedException
	{
		homePage = new HomePageActions(driver);
		actionPage = new ActionsPageActions(driver);
		alertpg = new AlertPageActions(driver);
		pPage = new PoPageActions(driver);
		clPage = new ColorLoadingPageActions(driver);
		String title = homePage.pageTitleVerification();
		System.out.println(title);
		Assert.assertEquals(title, "Home Page for this site");
		homePage.pageNavigate();
		actionPage.enterText();
		actionPage.enterNumberAndCheck();
		actionPage.clickAndCountCheckBoxes();
		actionPage.linkClickAndCount();
		actionPage.selcttTabOptionSelect();
		//actionPage.dragAndDrop();
		actionPage.calendarDateSelect();
		alertpg.alertHandling();
		pPage.extractText();
		clPage.colorBoxClick();
		System.out.println("Complete Test ");
		
	}
	
	@AfterTest
	public void destroy()
	{
		driver.quit();
	}

}
