package PageActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SampleRun.base;

public class AlertPageActions extends base{
	
	WebDriver driver;
	By PageExmpl = By.xpath("//li[@class='w3-dropdown-hover']/a[text()='Page Examples  ']");
	By alertpage = By.xpath("//div[@class='w3-dropdown-content w3-white w3-card-4']/a[text()='Alerted page']");
	
	
	
	public AlertPageActions(WebDriver driver) {
		this.driver = driver;
	}


		
	public void alertHandling() throws InterruptedException
	{
		Thread.sleep(5000);
		this.driver.findElement(PageExmpl).click();
		this.driver.findElement(alertpage).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

}
