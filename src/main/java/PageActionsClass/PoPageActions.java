package PageActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SampleRun.base;

public class PoPageActions extends base{
	
	WebDriver driver;
	By redText = By.xpath("//div[@class='w3-container w3-pale-red']//div/p");
	By PageExmpl = By.xpath("//li[@class='w3-dropdown-hover']/a[text()='Page Examples  ']");
	By alertpage = By.xpath("//div[@class='w3-dropdown-content w3-white w3-card-4']/a[text()='Page with Links']");
	
	
	
	public PoPageActions(WebDriver driver) {
		this.driver = driver;
	}


	
	public void extractText() throws InterruptedException 
	{
		Thread.sleep(5000);
		this.driver.findElement(PageExmpl).click();
		this.driver.findElement(alertpage).click();
		Thread.sleep(5000);
		System.out.println(this.driver.findElement(redText).getText());
	}

}
