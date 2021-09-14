package PageActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SampleRun.base;

public class HomePageActions extends base{
	
	WebDriver driver;
	By PageExmpl = By.xpath("//li[@class='w3-dropdown-hover']/a[text()='Page Examples  ']");
	By Aaction = By.xpath("//div[@class='w3-dropdown-content w3-white w3-card-4']/a[text()='Actions']");
	
	
	
	public HomePageActions(WebDriver driver) {
		this.driver = driver;
	}


	public String pageTitleVerification()
	{
		return driver.getTitle();
	}
	
	public void pageNavigate() throws InterruptedException
	{
		Thread.sleep(5000);
		this.driver.findElement(PageExmpl).click();
		this.driver.findElement(Aaction).click();
	}

}
