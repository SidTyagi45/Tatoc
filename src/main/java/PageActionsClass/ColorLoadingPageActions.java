package PageActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import SampleRun.base;

public class ColorLoadingPageActions extends base{
	
	WebDriver driver;
	By greenLoader = By.xpath("//button[@id='start_green' and text()='Start loading green']");
	By greenLoaded = By.xpath("//div[@id='loading_green']/label[text()='green']");
	By greenBlueLoader = By.xpath("//button[@id='start_green_and_blue' and text()='Start loading green and blue']");
	By greenBlueLoaded = By.xpath("//h2[@id='finish_green_and_blue']");
	By PageExmpl = By.xpath("//li[@class='w3-dropdown-hover']/a[text()='Page Examples  ']");
	By colorLoading = By.xpath("//div[@class='w3-dropdown-content w3-white w3-card-4']/a[text()='Color Loading']");
	
	
	
	public ColorLoadingPageActions(WebDriver driver) {
		this.driver = driver;
	}


	
	public void colorBoxClick() throws InterruptedException 
	{
		Thread.sleep(5000);
		this.driver.findElement(PageExmpl).click();
		this.driver.findElement(colorLoading).click();
		Thread.sleep(5000);
		this.driver.findElement(greenLoader).click();
		Thread.sleep(5000);
		this.driver.findElement(greenLoaded).isDisplayed();
		
		this.driver.findElement(greenBlueLoader).click();
		Thread.sleep(8000);
		this.driver.findElement(greenBlueLoaded).isEnabled();
		
		System.out.println("Colors Loaded");
		
	}

}
